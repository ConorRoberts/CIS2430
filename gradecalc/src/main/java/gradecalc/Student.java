package gradecalc;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Student{

    private String name;
    private double gradeFinal;
    private double gradeMaximum;

    public Student(){
        setGradeFinal(0);
        setGradeMaximum(100);
    }

    public static double sumArray(JSONArray obj, double weight){
        double sum=0;
        for (Object i : obj){
            sum+=(Double.parseDouble(i.toString()))*weight;
        }
        return sum;
    }

    public Student(JSONObject obj) {
        this();
        setName(obj.get("name").toString());
    }

    public void setName(String studentName) {
        name=studentName;
    }

    public String getName() {
        return name;
    }

    public double getGradeMaximum(){
        return gradeMaximum;
    }

    public void setGradeMaximum(double n){
        gradeMaximum=n;
    }

    public double finalGrade() {
        if(getGradeFinal()>getGradeMaximum()){
            return getGradeMaximum();
        }
        return getGradeFinal();
    }

    public void setGradeFinal(double n){
        gradeFinal=n;
    }

    public double getGradeFinal(){
        return gradeFinal;
    }
    
    @Override
    public String toString() {
        return getName() + " " + finalGrade();
    }
    
}
