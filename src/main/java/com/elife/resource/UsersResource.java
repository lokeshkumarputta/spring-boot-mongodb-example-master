package com.elife.resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elife.documents.Users;
import com.elife.models.UserData;
import com.elife.service.UserService;

@Controller
//@RequestMapping("/rest")
public class UsersResource {

    @Autowired
    private UserService userService;
    

    @RequestMapping("/welcome")
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
	}
    
    @GetMapping("/show-users")
    public String showAllUsers(HttpServletRequest request) {
        request.setAttribute("users", userService.showAllUsers());
        request.setAttribute("mode", "ALL_USERS");
		return "welcomepage";
    }
    
    @RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "welcomepage";
	}

	@PostMapping("/save-user")
	public String registerUser(@ModelAttribute UserData userData, BindingResult bindingResult, HttpServletRequest request) {
		userService.saveMyUser(userData);
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGIN");
		return "welcomepage";
	}
	
	@RequestMapping ("/login-user")
	public String loginUser(@ModelAttribute Users users, HttpServletRequest request) {
		/*if(userService.findByUsernameAndPassword(users.getUsername(), users.getPassword())!=null) {
			return "homepage";
		}
		else {*/
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "welcomepage";
			
//		}
	}
}
