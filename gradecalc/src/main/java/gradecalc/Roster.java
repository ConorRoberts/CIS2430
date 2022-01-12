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

    public Roster(String JSONFilename) {
        this();
        
        JSONArray studentArray = openFile(JSONFilename);

        for(Object current : studentArray){
            JSONObject s = (JSONObject) current;
            if (s.get("stream").toString().equals("challenge")){
                addStudent(new ChallengeStudent(s));
            }else if (s.get("stream").toString().equals("project")){
                addStudent(new ProjectStudent(s));
            }else if (s.get("stream").toString().equals("assignment")){
                addStudent(new AssignmentStudent(s));
            }
        }
    }

    private JSONArray openFile(String filename) {
        try{
          Object file=new JSONParser().parse(new FileReader(filename));
          JSONObject fileJson=(JSONObject) file;
          return (JSONArray) fileJson.get("students");
        }catch (Exception e){
          return null;
        }
    }

    public void setStudents(ArrayList<Student> studentArray) {
        students=studentArray;
    }

    public void addStudent(Student student) {
        getStudents().add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    
}
