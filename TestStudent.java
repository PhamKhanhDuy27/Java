public class TestStudent {
    public static void main(String[] args) {
    StudentOne student1 = new StudentOne("Love", "I23");
    System.out.println("Student has name : " + student1.getName() + " class: " + student1.getClasses());
    student1.setName("My");
    System.out.println("Student has name : " + student1.getName() + " class: " + student1.getClasses());
    student1.setClasses("I78");
    System.out.println("Student has name : " + student1.getName() + " class: " + student1.getClasses());
    }
}
class StudentOne {
    private String name = "John";
    private String classes = "C02";
    public StudentOne() {
    }
    public StudentOne(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    public String getName() {
        return this.name;
    }
    public String getClasses() {
        return this.classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
