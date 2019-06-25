package com.example.tk.tkDemo.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 描述:
 *
 * @author ppliu
 * created in 2019/6/21 14:22
 */
@Data
@Table(name = "student")
public class Student {
    /** 主键. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentName;
    private Long classId;
}
