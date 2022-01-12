package gradecalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class setGradeExamTest {

    @Test
    public void getGradeExamShouldEqualSetValue(){
        AssignmentStudent greg = new AssignmentStudent();
        double grade=50;
        greg.setGradeExam(grade);
        assertEquals(grade,greg.getGradeExam(), 0);
    }
}