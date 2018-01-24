package mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mybatis.domain.User;
import mybatis.mapper.UserMapper;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    public int insertUser(String username, int age) {

        User user = new User();
        user.setId(1);
        user.setUserName(username);
        user.setAge(age);

        return userMapper.insertUser(user);
    }

}