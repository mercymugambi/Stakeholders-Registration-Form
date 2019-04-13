package co.ke.bsl.util.servlet;

import java.io.IOException; 
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GzipFilter implements Filter {
	private static final Logger log = LoggerFactory.getLogger(GzipFilter.class);

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		if (request instanceof HttpServletRequest) {
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			String str = httpRequest.getHeader("accept-encoding");
			if (str != null && str.indexOf("gzip") != -1) {
				log.debug("GZIP supported, compressing.");
				GzipResponseWrapper wrapper = new GzipResponseWrapper(httpResponse);
				filterChain.doFilter(request, wrapper);
				wrapper.finishResponse();
			} else {
				filterChain.doFilter(request, response);
			}
		}

	}

	public void destroy() {
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}
}