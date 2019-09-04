package com.atguigu.gmall.gmallusermanage.controller;

import com.atguigu.gmall.gmallusermanage.bean.UserInfo;
import com.atguigu.gmall.gmallusermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("allUsers")
    public List<UserInfo> getAllUser(){

        List<UserInfo> userInfoListAll = userService.getUserInfoListAll();
        return  userInfoListAll;
    }

    @PostMapping("addUser")
    public String addUser(UserInfo userInfo){
        userService.addUser(userInfo);
        return  "success";
    }

    @PostMapping("updataUser")
    public String updataUser(UserInfo userInfo){
        userService.updateUser(userInfo);
        return  "success";

    }

    @PostMapping("deleteUser")
    public String deleteUser(UserInfo userInfo){
        userService.delUser(userInfo);
        return "success";
    }

    @PostMapping("updataUserByName")
    public  String updataUserByName(String name,UserInfo userInfo){
        userService.updateUserByName(userInfo.getName(),userInfo);
        return "success";

    }
}
