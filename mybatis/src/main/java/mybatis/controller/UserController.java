package mybatis.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mybatis.domain.User;
import mybatis.service.UserService;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUserList")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @RequestMapping("/addUser/{userName}/{age}")
    public int insertUser(@PathVariable String userName, @PathVariable int age) {
        return userService.insertUser(userName, age);
    }
}