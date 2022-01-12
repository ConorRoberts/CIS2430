package gradecalc;

public class Main {
    public static void main(String[] args){
        Roster roster = new Roster("roster.json");
        for (Student s : roster.getStudents()){
            System.out.println(s.toString());
        }
    }
}