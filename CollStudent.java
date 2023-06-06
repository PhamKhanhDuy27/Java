public class CollStudent implements Comparable <CollStudent> {
    private String name;
    private Integer age;
    private String address;
    public CollStudent(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CollStudent{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(CollStudent collStudent) {
        return this.getName().compareTo(collStudent.getName());
    }
}
