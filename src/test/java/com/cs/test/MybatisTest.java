package com.cs.test;

import com.cs.entity.User;
import com.cs.mapper.UserMapper;
import com.cs.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MybatisTest {

    public static void main(String[] args) throws Exception {
//        findByUserNameInfo();
        findByNameAndRole();

    }

    //根据用户名和角色id模糊查询用户信息(参数:用户名,角色id)
    private static void findByNameAndRole() throws Exception {
        SqlSession sqlSession = MybatisUtil.createSqlSession();
//        User user = new User();
//        user.setUserName("孙");
//        user.setUserRole(3l);
//        List<User> list = sqlSession.getMapper(UserMapper.class).findByUserNameAndRoleInfo(user);
        List<User> list = sqlSession.getMapper(UserMapper.class).findByUserNameAndRoleInfo("张", 3l);

        System.out.println("======================");

        for (User u : list) {
            System.out.println(
                    u.getId() + " " + u.getUserCode() + " " + u.getUserName() + " "
                            + u.getUserPassword() + " " + u.getGender() + " " + u.getBirthday()
                            + " " + u.getPhone() + " " + u.getAddress() + " " + u.getUserRole()
                            + " " + u.getCreationDate() + " " + u.getModifyBy()
                            + " " + u.getModifyDate()
            );
        }
        System.out.println("======================");

        MybatisUtil.closeSqlSession(sqlSession);
    }

    //根据用户名模糊查询用户信息(参数:用户名)
    public static void findByUserNameInfo() throws Exception {
        SqlSession sqlSession = MybatisUtil.createSqlSession();
        List<User> list = sqlSession.getMapper(UserMapper.class).findByUserNameInfo("张");
        for (User u : list) {
            System.out.println(
                    u.getId() + " " + u.getUserCode() + " " + u.getUserName() + " "
                            + u.getUserPassword() + " " + u.getGender() + " " + u.getBirthday()
                            + " " + u.getPhone() + " " + u.getAddress() + " " + u.getUserRole()
                            + " " + u.getCreationDate() + " " + u.getModifyBy()
                            + " " + u.getModifyDate()
            );
        }
        MybatisUtil.closeSqlSession(sqlSession);
    }

}
