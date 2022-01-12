package gradecalc;

import org.json.simple.JSONObject;

public class ChallengeStudent extends Student {

    private double gradeProject;
    private double gradeExam;

    public ChallengeStudent(){
        super();
    }

    public ChallengeStudent(JSONObject obj){
        super(obj);
        setGradeMaximum(100);
        setGradeExam(Double.parseDouble(obj.get("examGrade").toString())*0.5);
        setGradeProject(Double.parseDouble(obj.get("projectGrade").toString())*0.5);
        setGradeFinal(getGradeExam()+getGradeProject());
    }

    public final void setGradeProject(double n){
        gradeProject=n;
    }

    public final void setGradeExam(double n){
        gradeExam=n;
    }

    public final double getGradeExam(){
        return gradeExam;
    }

    public final double getGradeProject(){
        return gradeProject;
    }
    
}
