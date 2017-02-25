/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service1;

import com.mycompany.domain.Student;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author W207777797
 */
public class StudentManagerTest extends TestCase{
    
    public StudentManagerTest(String name) {
        super(name);
    }
    
    @Test
    public void testAddStudent(){
        Student s= new Student();
        s.setName("bob");
        s.setAge(20);
        
      StudentManager smi= new StudentManager();  
      int result=smi.addStudent(s);
      assertEquals(0,result);
  
      
    }
        
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    
}
