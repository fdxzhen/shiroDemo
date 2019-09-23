package com.zhenhao.dao;

import com.zhenhao.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {

    @Select("select * from user where username=#{username}")
    User findByUserName(String userName);

}
