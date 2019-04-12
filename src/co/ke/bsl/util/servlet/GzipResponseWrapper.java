package co.ke.bsl.util.servlet;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GzipResponseWrapper extends HttpServletResponseWrapper {
	private static final Logger log = LoggerFactory.getLogger(GzipResponseWrapper.class);
	private HttpServletResponse response = null;
	private ServletOutputStream stream = null;
	private PrintWriter writer = null;

	public GzipResponseWrapper(HttpServletResponse response) {
		super(response);
		this.response = response;
	}

	public void finishResponse() {
		try {
			if (this.writer != null) {
				this.writer.close();
			} else if (this.stream != null) {
				this.stream.close();
			}
		} catch (IOException var2) {
			log.error("Could not close streams.", var2);
		}

	}

	private ServletOutputStream createOutputStream() throws IOException {
		return new GzipResponseStream(this.response);
	}

	public void flushBuffer() throws IOException {
		this.stream.flush();
	}

	public ServletOutputStream getOutputStream() throws IOException {
		if (this.writer != null) {
			throw new IllegalStateException("getWriter() has already been called!");
		} else {
			if (this.stream == null) {
				this.stream = this.createOutputStream();
			}

			return this.stream;
		}
	}

	public PrintWriter getWriter() throws IOException {
		if (this.writer != null) {
			return this.writer;
		} else if (this.stream != null) {
			throw new IllegalStateException("getOutputStream() has already been called!");
		} else {
			this.stream = this.createOutputStream();
			this.writer = new PrintWriter(new OutputStreamWriter(this.stream, "UTF-8"));
			return this.writer;
		}
	}

	public void setContentLength(int paramInt) {
	}
}