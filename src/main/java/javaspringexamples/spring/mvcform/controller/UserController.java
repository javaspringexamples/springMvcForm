package javaspringexamples.spring.mvcform.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javaspringexamples.spring.mvcform.domain.Gender;
import javaspringexamples.spring.mvcform.domain.User;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
@Controller
public class UserController {

	private static final String[] countries = { "Morocco", "United States", "France" };

	@RequestMapping(value = "/form")
	public ModelAndView user() {
		ModelAndView modelAndView = new ModelAndView("userForm", "user", new User());
		modelAndView.addObject("genders", Gender.values());
		modelAndView.addObject("countries", countries);

		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processUser(@Valid User user, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);

		if (result.hasErrors()) {
			modelAndView.addObject("genders", Gender.values());
			modelAndView.addObject("countries", countries);
			modelAndView.setViewName("userForm");
		} else {
			modelAndView.setViewName("userResult");
		}

		return modelAndView;
	}
}