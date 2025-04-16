import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
//        StudentManager student = new StudentManager();
//                students.put(1,"sonia");
//                students.put(2,"Queen");
//                students.put(3,"hope");
        StudentManager.addStudent(students,5,"");
        StudentManager.addStudent(students,4,"michael");
        StudentManager.addStudent(students,3,"hope");
        StudentManager.addStudent(students,2,"gaju");

        StudentManager.sortStudents(students);



        StudentManager.searchStudent(students,7);
        StudentManager.searchStudent(students,4);

        StudentManager.removeStudent(students,0);
        StudentManager.removeStudent(students,2);

        StudentManager.findStudentWithHighestId(students);
        StudentManager.findStudentWithLowestId(students);



    }
}
