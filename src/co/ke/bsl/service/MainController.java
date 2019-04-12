package co.ke.bsl.service;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.ke.bsl.dao.UserDataDAO;
import net.tanesha.recaptcha.ReCaptchaImpl;
import net.tanesha.recaptcha.ReCaptchaResponse;

@Controller
@RequestMapping({ "/*" })
public class MainController {
	private static final Logger log = LoggerFactory.getLogger(MainController.class);
	@Resource(name = "userDataDAO")
	@Autowired
	private UserDataDAO userDataDAO;


	private static final String CAPTCHA2 = "g-recaptcha-response";

	@RequestMapping(value = { "index.html" }, method = { RequestMethod.GET })
	public String home() {
		log.debug(" AFA Registration");
		return "Payment";
	}

	@RequestMapping(value = { "/" })
	public String register(@ModelAttribute("accountForm") co.ke.bsl.model.AFAPartner accountForm, BindingResult result,
			ModelMap model) {
		String message = "";

		model.put("message", message);
		model.put("accountForm", accountForm);

		return "Payment";
	}

	@RequestMapping(value = { "/register" })
	public String addPartner(@ModelAttribute("accountForm") @Valid co.ke.bsl.model.AFAPartner accountForm,
			BindingResult result, ModelMap model, HttpSession session,
			
			@RequestParam("g-recaptcha-response") String grecaptcharesponse, ServletRequest servletRequest) throws IOException {
		String message = "";

		model.put("message", message);
		model.put("accountForm", accountForm);
		if (result.hasErrors()) {
			
			model.addAttribute("message", "Please fill all the fields");
			return "Payment";
		}

	
		System.out.println(grecaptcharesponse);
		
		boolean verify = RecaptchaService.verify(grecaptcharesponse);
		
	
		
		System.out.println(grecaptcharesponse);
		
		if(!verify){
			accountForm.setCaptcha("");
			model.addAttribute("message", "Captcha does not match");
			return "Payment";
		}

		else {
			userDataDAO.addFetchedRegistration(accountForm);
			accountForm.setCaptcha("");
			model.addAttribute("message", "Form Successfully submitted");
			return "successful";
		}

	}

}