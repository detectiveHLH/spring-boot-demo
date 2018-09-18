package com.detectivehlh.springbootdemo.data.dao;

import com.detectivehlh.springbootdemo.domain.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRoleMapper {

    /**
     * 通过用户查询所有角色
     * @param userId
     * @return
     */
    List<Integer> queryAccessableRolesByUserId(String userId);

    /**
     * 通过用户id查询用户角色
     * @return
     */
    UserRole queryByUserId(String userId);

    /**
     * 查询所有的用户角色
     * @return
     */
    List<UserRole> all();

    /**
     * 添加用户角色
     * @param userRole
     * @return
     */
    int add(UserRole userRole);

    /**
     * 编辑用户角色
     * @param userRole
     * @return
     */
    int edit(UserRole userRole);

    /**
     * 删除用户角色
     * @param userId
     * @return
     */
    int del(@Param("userId") String userId);
}
