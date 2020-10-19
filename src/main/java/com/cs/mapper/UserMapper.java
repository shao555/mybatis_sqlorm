package com.cs.mapper;

import com.cs.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /*根据用户名模糊查询用户信息(参数:字符串)

     * */
    public List<User> findByUserNameInfo(String name) throws Exception;

    /*根据用户名和角色id模糊查询用户信息(参数:用户对象)

     * */
//    public List<User> findByUserNameAndRoleInfo(@Param("User") User user) throws Exception;
    public List<User> findByUserNameAndRoleInfo(@Param("name") String name,@Param("userRole") long userRole) throws Exception;


}
