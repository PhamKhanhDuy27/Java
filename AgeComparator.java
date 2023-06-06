import java.util.Comparator;

public class AgeComparator implements Comparator<CollStudent> {
    @Override
    public int compare(CollStudent o1, CollStudent o2) {
        if(o1.getAge() > o2.getAge()) {
            return 1;
        }
        else if (o1.getAge() == o2.getAge()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
