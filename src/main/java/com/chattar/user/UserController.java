package com.chattar.user;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class UserController {
	static Logger logger = Logger.getLogger(UserController.class.getName());
	@Autowired
	UserService userService;
	@RequestMapping(value="/listUsers", method = RequestMethod.GET )
	String listUsers(ModelMap model){
		List<User> users = userService.getUsers(getLoggedInUser());
		model.put("users", users);
		return "listUser";
	}
	private String getLoggedInUser() {
		return "datta";
	}
	@RequestMapping(value="/addUser", method=RequestMethod.GET)
	String showAddUserPage() {
		return "addUser";
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	String addUser(@RequestParam String userName, String password, ModelMap model) {
		userService.addUser(new User(userName, password));
		model.clear();
		return "redirect:listUsers";
	}
	
	@RequestMapping(value="/deleteUser", method=RequestMethod.GET)
	String deleteUser(@RequestParam String userName, ModelMap model) {
		logger.info("Deleting user:"+userName);
		userService.deleteUser(userName);
		model.clear();
		return "redirect:listUsers";
	}
}
