package com.zhenhao.service.impl;

import com.zhenhao.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class UserServiceImpl implements UserService {


    public String userList(Model model) {
        model.addAttribute("value", "获取用户信息");
        return "user";
    }

    public String userAdd(Model model) {
        model.addAttribute("value", "新增用户");
        return "user";
    }

    public String userDelete(Model model) {
        model.addAttribute("value", "删除用户");
        return "user";
    }
}
