package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    void testAddNewStudent(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx", "StudentTest");
        assertEquals(1, studentList.getStudents().size());
    }

    @Test
    void testFindStudentById(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx", "StudentTest");
        Student s = studentList.findStudentById("6xxxxxxxx");
        assertEquals("6xxxxxxxx", s.getId());
    }

    @Test
    void testGiveScoreToId(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx", "StudentTest");
        studentList.giveScoreToId("6xxxxxxxx", 100);
        assertEquals(100, studentList.findStudentById("6xxxxxxxx").getScore());
    }

    @Test
    void testViewGradeOfId(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx", "StudentTest", 70);
        assertEquals("B", studentList.viewGradeOfId("6xxxxxxxx"));

    }

}