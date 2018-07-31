package com.feit.rhip3.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRepository  {
    @Select("select * from user where name=#{name}")
    User findByName(@Param("name") String name);
}
