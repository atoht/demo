package demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.entity.User;
import demo.service.UserI;

@Controller
@RequestMapping("/showUser")
public class ShowUser {
	
	private UserI ui;

	public UserI getUi() {
		return ui;
	}
	@Autowired
	public void setUi(UserI ui) {
		this.ui = ui;
	}
	@RequestMapping("/showU")
	public String showU(Integer id, HttpServletRequest requerst) {
		User u = ui.getUser(id);
		requerst.setAttribute("user", u);
		return "showU";
	}
}
