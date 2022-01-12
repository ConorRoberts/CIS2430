package gradecalc;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Roster {

    private ArrayList<Student> students;

    public Roster(){
        setStudents(new ArrayList<Student>());
    }

    public Roster(String fileName) {
        this();

        for(Object current : openFile(fileName)){
            if (((JSONObject) current).get("stream").toString().equals("challenge")){
                addStudent(new ChallengeStudent((JSONObject) current));
            }else if (((JSONObject) current).get("stream").toString().equals("project")){
                addStudent(new ProjectStudent((JSONObject) current));
            }else if (((JSONObject) current).get("stream").toString().equals("assignment")){
                addStudent(new AssignmentStudent((JSONObject) current));
            }
        }
    }

    private JSONArray openFile(String fileName) {
        try{
          Object file=new JSONParser().parse(new FileReader(fileName));
          JSONObject fileJson=(JSONObject) file;
          return (JSONArray) fileJson.get("students");
        }catch (Exception e){
          return null;
        }
    }

    public final void setStudents(ArrayList<Student> studentArray) {
        students=studentArray;
    }

    public final void addStudent(Student student) {
        getStudents().add(student);
    }

    public final ArrayList<Student> getStudents() {
        return students;
    }
    
}
