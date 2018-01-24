package mybatis.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

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

    @RequestMapping("/getUserList/{pageNum}/{pageSize}")
    public List<User> getUserListPage(@PathVariable int pageNum, @PathVariable int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userService.getUserList();
    }

    @RequestMapping("/addUser/{userName}/{age}")
    public int insertUser(@PathVariable String userName, @PathVariable int age) {
        return userService.insertUser(userName, age);
    }

}