import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private Student emptyStudent;

    private Student actualStudent;

    @Test
    public void testStudentConstructor(){
        actualStudent = new Student();
        assertNull(emptyStudent);
        assertNotNull(actualStudent);
    }
    @Test
    public void testStudentConstructorThreeArgs(){
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(95);
        grades.add(87);
        actualStudent = new Student(24, "alex", grades);
        assertNotNull(actualStudent);

    }

    @Before
    public void setup(){
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(89);
        grades.add(95);
        actualStudent = new Student(879, "Alex",grades);
    }
    @Test
    public void testStudentGetters(){
        assertEquals(actualStudent.getId(),879);
        assertEquals(actualStudent.getName(), "Alex");
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(89);
        grades.add(95);
        assertEquals(actualStudent.getGrades(), grades);
    }

    @Test
    public void testStudentAddGrade(){
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(89);
        grades.add(95);
        grades.add(67);
        actualStudent.addGrade(67);
        assertEquals(actualStudent.getGrades(),grades);
    }

    @Test
    public void testStudentGetGradeAverage(){
        assertEquals(actualStudent.getGradeAverage(), 92, 0.0000001);
    }

}
