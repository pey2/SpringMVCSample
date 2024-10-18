package com.samplepackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPage(@RequestParam("name") String name, @RequestParam("pass") String pass, Model model) {
        // get data
//        String name = req.getParameter("name");
//        String pass = req.getParameter("pass");

        if(pass.equals("admin")) {
            String msg = "Hello " + name;
            // add message to the model
            model.addAttribute("message", msg);
            return "viewpage";
        } else {
            String msg = "Sorry " + name + " You entered an incorrect password.";
            model.addAttribute("message", msg);
            return "wrongpass";
        }
    }
}
