package com.detectivehlh.test.data.dao;

import com.detectivehlh.test.domain.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRoleMapper {
    /**
     * 查询所有的用户角色
     * @return
     */
    List<UserRole> all();
}
