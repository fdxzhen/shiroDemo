package com.zhenhao.controller;

import com.zhenhao.pojo.User;
import com.zhenhao.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.apache.shiro.SecurityUtils.getSubject;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public String userList(Model model) {

        Subject subject = getSubject();
        if(subject.isPermitted("user/user")){
            return userService.userList(model);
        }
        model.addAttribute("value", "那您没有权限");
        return "user";
    }

    @RequiresPermissions("user/add")
    @RequestMapping("/add")
    public String userAdd(Model model) {
        model.addAttribute("value", "add");
        return "user";
    }

    @RequiresPermissions("user/delete")
    @RequestMapping("/delete")
    public String userDelete(Model model) {
        model.addAttribute("value", "删除");
        return "user";
    }
}