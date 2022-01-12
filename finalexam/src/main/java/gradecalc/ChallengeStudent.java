package gradecalc;

import org.json.simple.JSONObject;

public class ChallengeStudent extends Student {

    private double gradeProject;
    private double gradeExam;
    private final double gradeCap=100;
    private final double weightExam=0.5;
    private final double weightProject=0.5;

    public ChallengeStudent(){
        super();
    }

    public ChallengeStudent(JSONObject obj){
        super(obj);
        setGradeMaximum(gradeCap);
        setGradeExam(Double.parseDouble(obj.get("examGrade").toString())*weightExam);
        setGradeProject(Double.parseDouble(obj.get("projectGrade").toString())*weightProject);
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
