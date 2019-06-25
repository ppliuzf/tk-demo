package com.example.tk.tkDemo.dto;

import lombok.Data;

/**
 * 描述:
 *
 * @author ppliu
 * created in 2019/6/21 15:07
 */
@Data
public class StudentDto {
    private String classRoomName;
    private String studentName;

    @Override
    public String toString() {
        return "StudentDto{" +
                "classRoomName='" + classRoomName + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
