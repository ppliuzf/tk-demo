package com.example.tk.tkDemo.mapper;

import com.example.tk.tkDemo.dto.StudentDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 描述:
 *
 * @author ppliu
 * created in 2019/6/21 14:24
 */
public interface StudentMapper  {
    @Select("SELECT" +
            " s.student_name studentName," +
            " c.`name` classRoomName" +
            " FROM" +
            " student s" +
            " LEFT JOIN class_room c ON s.class_id = c.Id")
    List<StudentDto> testSelect();
    @Select("" +
            "SELECT count(0) from student")
    int testSelectCount();
}
