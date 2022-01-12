package gradecalc;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Student{

    private String name;
    private double gradeFinal;
    private double gradeMaximum;

    public Student(){
       
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

    public final void setName(String studentName) {
        name=studentName;
    }

    public final String getName() {
        return name;
    }

    public final double getGradeMaximum(){
        return gradeMaximum;
    }

    public final void setGradeMaximum(double n){
        gradeMaximum=n;
    }

    public final double finalGrade() {
        if(getGradeFinal()>getGradeMaximum()){
            return getGradeMaximum();
        }
        return getGradeFinal();
    }

    public final void setGradeFinal(double n){
        gradeFinal=n;
    }

    public final double getGradeFinal(){
        return gradeFinal;
    }
    
    @Override
    public final String toString() {
        return getName() + " " + ((int) finalGrade());
    }
    
}
