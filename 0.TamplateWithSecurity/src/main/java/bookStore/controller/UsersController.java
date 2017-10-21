package bookStore.controller;

import bookStore.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mariababan on 21/10/2017.
 */

@Controller
public class UsersController {

    @Autowired
    UserService userService;

    @RequestMapping("/admin")
    String home2(Model model) {
        model.addAttribute("users", userService.getAll());
        return "home";
    }

    @RequestMapping("/pleb")
    String home(Model model) {
        return "homepleb";
    }

    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        return "accessDenied";
    }
}
