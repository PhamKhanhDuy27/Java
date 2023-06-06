import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollegeStudentTest {
    public static void main(String[] args) {
        CollegeStudent collegeStudent1 = new CollegeStudent("Nam", 20, "HN");
        CollegeStudent collegeStudent2 = new CollegeStudent("Hung", 21, "HN");
        CollegeStudent collegeStudent3 = new CollegeStudent("Ha", 22, "HN");
        Map<Integer, CollegeStudent> collegeStudentMap = new HashMap<Integer, CollegeStudent>();
        collegeStudentMap.put(1, collegeStudent1);
        collegeStudentMap.put(2, collegeStudent2);
        collegeStudentMap.put(3, collegeStudent3);
        collegeStudentMap.put(4, collegeStudent1);
        for(Map.Entry<Integer, CollegeStudent> collegeStudent : collegeStudentMap.entrySet()){
            System.out.println(collegeStudent.toString());
        }
        System.out.println("...........Set");
        Set<CollegeStudent> collegeStudents = new HashSet<CollegeStudent>();
        collegeStudents.add(collegeStudent1);
        collegeStudents.add(collegeStudent2);
        collegeStudents.add(collegeStudent3);
        collegeStudents.add(collegeStudent1);
        for(CollegeStudent collegeStudent : collegeStudents) {
            System.out.println(collegeStudent.toString());
        }
    }
}
