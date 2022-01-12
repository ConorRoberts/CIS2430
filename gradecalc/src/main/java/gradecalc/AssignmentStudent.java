package gradecalc;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AssignmentStudent extends Student implements ResearchSubject{
    private boolean participating;
    private double gradeQuiz;
    private double gradeAssignment;
    private double gradeExam;

    public AssignmentStudent(){
        super();
        setGradeQuiz(0);
        setGradeAssignment(0);
        setGradeExam(0);
        setParticipating(false);
    }
    
    public AssignmentStudent(JSONObject obj){
        super(obj);
        setGradeMaximum(60);
        setGradeQuiz(sumArray((JSONArray) obj.get("quizGrades"),0.1));
        setGradeAssignment(sumArray((JSONArray) obj.get("assignmentGrades"),0.05));
        setGradeExam(Double.parseDouble(obj.get("examGrade").toString())*0.2);
        setGradeFinal(getGradeQuiz()+getGradeAssignment()+researchPerk());
    }

    public final void setGradeAssignment(double n){
        gradeAssignment=n;
    }

    public final double getGradeAssignment(){
        return gradeAssignment;
    }

    public final double getGradeExam(){
        return gradeExam;
    }

    public final double getGradeQuiz(){
        return gradeQuiz;
    }

    public final void setGradeExam(double n){
        gradeExam=n;
    }

    public final void setGradeQuiz(double n){
        gradeQuiz=n;
    }

    public void setParticipating(boolean isParticipating){
        participating=isParticipating;
    }

    public double researchPerk(){
        if (participating){
            return 0.05*getGradeMaximum();
        }
        return 0;
    }
}

