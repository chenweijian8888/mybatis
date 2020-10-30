package com.qf.service;

import com.qf.entity.User;
import com.qf.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TsetMain {
    public static void main(String[] args) {
        /*
        * 工厂模式建造者模式*/
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(
                TsetMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        /*opensession   自动提交  默认为false*/
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        /*拿到接口,相当于以前的new dao */
        /*反射写法*/
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        int insert = mapper.insert(user);
        System.out.println(insert);
        /*User user = mapper.selectByid(2);
        System.out.println(user);*/
    }
}
