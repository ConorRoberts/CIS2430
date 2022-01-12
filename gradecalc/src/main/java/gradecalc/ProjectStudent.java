package gradecalc;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ProjectStudent extends Student implements ResearchSubject{

    private double gradeMilestone;
    private double gradeMidterm;
    private double gradeExam;
    private boolean participating;

    public ProjectStudent(){
        super();
        setGradeMilestone(0);
        setGradeMidterm(0.00);
        setGradeExam(0.00);
        setParticipating(false);
    }
    
    public ProjectStudent(JSONObject obj) {
        super(obj);
        setGradeMaximum(100);
        setGradeMilestone(sumArray((JSONArray) obj.get("milestoneGrades"),0.2));
        setGradeMidterm((Double.parseDouble(obj.get("midtermGrade").toString()))*0.2);
        setGradeExam((Double.parseDouble(obj.get("examGrade").toString()))*0.2);
        setGradeFinal(getGradeExam()+getGradeMidterm()+getGradeMilestone()+researchPerk());
    }

    public final boolean getParticipating(){
        return participating;
    }

    public void setParticipating(boolean isParticipating) {
        participating=isParticipating;
    }

    public double researchPerk() {
        if (getParticipating()){
            return 0.05*getGradeMaximum();
        }
        return 0;
    }

    public final double getGradeMilestone(){
        return gradeMilestone;
    }

    public final double getGradeExam(){
        return gradeExam;
    }

    public final double getGradeMidterm(){
        return gradeMidterm;
    }

    public final void setGradeExam(Double n){
        gradeExam=n;
    }

    public final void setGradeMidterm(Double n){
        gradeMidterm=n;
    }

    public final void setGradeMilestone(double n) {
        gradeMilestone=n;
    }
}
