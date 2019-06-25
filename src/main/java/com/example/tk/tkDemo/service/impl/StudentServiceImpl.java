package com.example.tk.tkDemo.service.impl;

import com.example.tk.tkDemo.entity.ClassRoom;
import com.example.tk.tkDemo.entity.Student;
import com.example.tk.tkDemo.mapper.ClassRoomMapper;
import com.example.tk.tkDemo.mapper.StudentMapper;
import com.example.tk.tkDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 *
 * @author ppliu
 * created in 2019/6/21 14:26
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ClassRoomMapper classRoomMapper;

    @Override
    public void insert() {
        for (int i = 0; i < 20; i++) {
            Student student = new Student();
            student.setStudentName("张"+i+"疯");
            ClassRoom classRoom = new ClassRoom();
            classRoom.setName("第"+i+"教室");
            classRoomMapper.insert(classRoom);
            student.setClassId(classRoom.getId());
        }
    }
}
