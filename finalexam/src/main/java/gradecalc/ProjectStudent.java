package gradecalc;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ProjectStudent extends Student implements ResearchSubject{

    private double gradeMilestone;
    private double gradeMidterm;
    private double gradeExam;
    private boolean participating;
    private final double gradeCap=100;
    private final double weightMilestone=0.2;
    private final double weightMidterm=0.2;
    private final double weightExam=0.2;
    private final double weightResearch=0.05;

    public ProjectStudent(){
        super();
        setParticipating(false);
    }
    
    public ProjectStudent(JSONObject obj) {
        super(obj);
        setGradeMaximum(gradeCap);
        isThisStudentParticipatingInTheSchoolWork(obj);
        setGradeMilestone(sumArray((JSONArray) obj.get("milestoneGrades"),weightMilestone));
        setGradeMidterm((Double.parseDouble(obj.get("midtermGrade").toString()))*weightMidterm);
        setGradeExam((Double.parseDouble(obj.get("examGrade").toString()))*weightExam);
        setGradeFinal(getGradeExam()+getGradeMidterm()+getGradeMilestone()+researchPerk());
    }

    private void isThisStudentParticipatingInTheSchoolWork(JSONObject obj){
        if (obj.containsKey("participating")){
            setParticipating(Boolean.parseBoolean(obj.get("participating").toString()));
        }else{
            setParticipating(false);
        }
    }

    public final boolean getParticipating(){
        return participating;
    }

    public final void setParticipating(boolean isParticipating) {
        participating=isParticipating;
    }

    public final double researchPerk() {
        if (getParticipating()){
            return weightResearch*getGradeMaximum();
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
