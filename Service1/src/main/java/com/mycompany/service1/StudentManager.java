/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service1;

import com.mycompany.dao.StudentManagerDao;
import com.mycompany.domain.Student;

/**
 *
 * @author W207777797
 */
public class StudentManager implements StudentManagerInt {

    @Override
    public int addStudent(Student student) {
        StudentManagerDao s2 = new StudentManagerDao();
        try {
            s2.addStudent(student);
            return 0;
        } catch (Exception e) {
            return -1;
        }

    }

}
