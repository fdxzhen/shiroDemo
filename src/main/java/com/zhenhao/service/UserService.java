package com.zhenhao.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

public interface UserService {

    public String userList(Model model);
    public String userAdd(Model model);
    public String userDelete(Model model);
}
