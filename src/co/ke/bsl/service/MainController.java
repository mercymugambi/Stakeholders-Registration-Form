package co.ke.bsl.service;

import java.io.IOException;
import java.util.List;

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
import org.springframework.web.bind.annotation.ResponseBody;

import co.ke.bsl.dao.UserDataDAO;
import co.ke.bsl.model.SubCounty;
import co.ke.bsl.model.Ward;
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
		model.put("countyList", userDataDAO.getCountyList());

		return "Payment";
	}

	@RequestMapping(value = { "/register" })
	public String addPartner(@ModelAttribute("accountForm") @Valid co.ke.bsl.model.AFAPartner accountForm,
			BindingResult result, ModelMap model, HttpSession session,

			@RequestParam("g-recaptcha-response") String grecaptcharesponse, ServletRequest servletRequest)
			throws IOException {
		String message = "";
		
		System.out.println("Building-------------"+accountForm.getBuildingName());
		
		System.out.println("Company email--------------"+accountForm.getCompanyEmail());

		model.put("message", message);
		model.put("accountForm", accountForm);
		model.put("countyList", userDataDAO.getCountyList());
		if (result.hasErrors()) {
     
			System.out.println(result.getFieldError());
			model.addAttribute("message", "Please fill all the fields");
			return "Payment";
		}

		System.out.println(grecaptcharesponse);

		boolean verify = RecaptchaService.verify(grecaptcharesponse);

		System.out.println(grecaptcharesponse);

		if (!verify) {
			accountForm.setCaptcha("");
			model.addAttribute("message", "Captcha does not match");
			return "Payment";
		}

		else {
			userDataDAO.addFetchedRegistration(accountForm);
			System.out.println("Adding new officer-- at the controller------------"+accountForm.getBuildingName());
			accountForm.setCaptcha("");
			model.addAttribute("message", "Form Successfully submitted");
			return "successful";
		}

	}
	
	@RequestMapping(value = "/loadSubcounty", headers = "Accept=*/*", method = RequestMethod.GET)
    public @ResponseBody
    List<SubCounty> loadStates(@RequestParam(value = "spd_county_id", required = true) Integer spd_county_id) throws IllegalStateException {

		System.out.println("the county id "+spd_county_id);
        //Specify the returning object you want here
        return  userDataDAO.getSubCountyList(spd_county_id);
    }
	
	@RequestMapping(value = "/ward", headers = "Accept=*/*", method = RequestMethod.GET)
    public @ResponseBody
    List<Ward> loadwards(@RequestParam(value = "spd_subcounty_id", required = true) Integer spd_subcounty_id) throws IllegalStateException {

		System.out.println("the county id "+spd_subcounty_id);
        //Specify the returning object you want here
        return  userDataDAO.getWardList(spd_subcounty_id);
    }
	

}