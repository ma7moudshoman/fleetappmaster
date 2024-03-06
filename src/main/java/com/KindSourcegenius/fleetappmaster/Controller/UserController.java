package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.UserService;
import com.KindSourcegenius.fleetappmaster.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/FindAllUsers")
    public String findAll(Model model){
        model.addAttribute("users" ,userService.findAll());
        return "user";
    }

    @GetMapping("/findUserById")
    public User findById(int id){
        return userService.findById(id);
    }

    @PostMapping("/addNewUser")
    public RedirectView addNewUser(User user, RedirectAttributes redirectAttributes){
        userService.SaveUser(user);
        RedirectView redirectView=new RedirectView("/login",true);
        redirectView.addStaticAttribute("message","you successfully registered , you can login");
        return redirectView;
    }

    @PutMapping("/updateUser")
    public String update(User user){
        userService.SaveUser(user);
        return "redirect:/users";
    }
    @DeleteMapping("/deleteUser")
    public String delete(int id){
        userService.deleteUser(id);
        return "redirect:/users";
    }



}
