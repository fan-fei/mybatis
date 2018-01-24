package mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import mybatis.domain.User;

public interface UserMapper {

    @Select("select * from user")
    public List<User> getUserList();

    @Insert("insert into user1 (userName,age) values(#{userName},#{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int insertUser(User user);
}