package gradecalc;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AssignmentStudent extends Student implements ResearchSubject{
    private boolean participating;
    private double gradeQuiz;
    private double gradeAssignment;
    private double gradeExam;
    private final double weightQuiz=0.1;
    private final double weightAssignment=0.05;
    private final double weightExam=0.2;
    private final double gradeCap=60;
    private final double weightResearch=0.05;

    public AssignmentStudent(){
        super();
        setParticipating(false);
    }
    
    public AssignmentStudent(JSONObject obj){
        super(obj);
        setGradeMaximum(gradeCap);
        isThisStudentParticipatingInTheSchoolWork(obj);
        setGradeQuiz(sumArray((JSONArray) obj.get("quizGrades"),weightQuiz));
        setGradeAssignment(sumArray((JSONArray) obj.get("assignmentGrades"),weightAssignment));
        setGradeExam(Double.parseDouble(obj.get("examGrade").toString())*weightExam);
        setGradeFinal(getGradeQuiz()+getGradeAssignment()+getGradeExam()+researchPerk());
    }

    private void isThisStudentParticipatingInTheSchoolWork(JSONObject obj){
        if (obj.containsKey("participating")){
            setParticipating(Boolean.parseBoolean(obj.get("participating").toString()));
        }else{
            setParticipating(false);
        }
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

    public final void setParticipating(boolean isParticipating){
        participating=isParticipating;
    }

    public final boolean getParticipating(){
        return participating;
    }

    public final double researchPerk(){
        if (getParticipating()){
            return weightResearch*getGradeMaximum();
        }
        return 0;
    }
}

