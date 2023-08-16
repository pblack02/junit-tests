import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort emptyCohort;
    private Cohort actualCohort;

    @Before
    public void setup(){
        actualCohort = new Cohort();
    }


    @Test
    public void testCohortConstructors(){
        assertNull(emptyCohort);
        assertNotNull(actualCohort);
    }

    @Test
    public void testCohortAddStudent(){
        Student actualStudent = new Student(1l, "Presley");
        actualCohort.addStudent(actualStudent);
        assertEquals(Arrays.asList(actualStudent), actualCohort.getStudents());
    }

    @Test
    public void testCohortGetCohortAverage(){
        Student actualStudent = new Student(1l, "Presley");
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);
        actualCohort.addStudent(actualStudent);
        assertEquals(75, actualCohort.getCohortAverage(), 0.00001);

        Student actualStudentTwo = new Student(1l, "Presley");
        actualStudentTwo.addGrade(0);
        actualStudentTwo.addGrade(25);
        actualStudentTwo.addGrade(50);
        actualCohort.addStudent(actualStudentTwo);
        assertEquals(50, actualCohort.getCohortAverage(), 0.00001);

    }

}
