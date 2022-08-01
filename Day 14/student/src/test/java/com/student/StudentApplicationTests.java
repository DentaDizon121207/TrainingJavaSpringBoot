package com.student;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)

class StudentApplicationTests {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void testCreateStudent() {

        Student student = new Student();

        student.setStudentName("Denny");
        student.setGender('M');
        student.setWeight(80.0);
        student.setHeight(170.0);
        student.setPhone("081213141516");
        student.setAddress("Jalan Kemang Raya");

        Student res = studentRepository.save(student);

        assertNotNull(res);
    }
    @Test
    public void testGetStudent() {

        Student res = studentRepository.findByStudentName("Denny");

        assertEquals("Denny", res.getStudentName().trim());
    }
    @Test
    public void testGetStudents() {

        List<Student> res = studentRepository.findAll();

        assertThat(res).size().isGreaterThan(0);
    }
    @Test
    public void testUpdateStudent() {

        Student student = studentRepository.findByStudentName("Denny");

        student.setStudentName("Aleandra");
        student.setGender('F');
        student.setWeight(40.0);
        student.setHeight(155.0);
        student.setPhone("081216151413");
        student.setAddress("Jalan Raya Ragunan");

        Student res = studentRepository.save(student);

        assertEquals("Aleandra", res.getStudentName().trim());
    }
    @Test
    public void testDeleteStudent() {

        Student student = studentRepository.findByStudentName("Denny");

        studentRepository.delete(student);

        assertNull(studentRepository.findByStudentName("Denny"));
    }

}
