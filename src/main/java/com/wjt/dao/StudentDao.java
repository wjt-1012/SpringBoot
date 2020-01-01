package com.wjt.dao;

import com.wjt.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 30239
 * @create 2020-01-01-15:17
 */
@Mapper
@Repository
public interface StudentDao {
    /**
     * 1.查询全部
     */
    @Select("select * from student")
    List<Student> findAll();
}
