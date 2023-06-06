import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        CollStudent collStudent1 = new CollStudent("Kien", 30, "HT");
        CollStudent collStudent2 = new CollStudent("Nam", 26, "HN");
        CollStudent collStudent3 = new CollStudent("Anh", 38, "HT");
        CollStudent collStudent4 = new CollStudent("Tung", 38, "HT");
        List<CollStudent> lists = new ArrayList<CollStudent>();
        lists.add(collStudent1);
        lists.add(collStudent2);
        lists.add(collStudent3);
        lists.add(collStudent4);
        Collections.sort(lists);
        for (CollStudent st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (CollStudent st : lists) {
            System.out.println(st.toString());
        }
    }
}
