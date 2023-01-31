public class Student {

    private String name;
    private char grade;
    private int group;
    private final String  SECRETNICKNAME="MySecretNickName";

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }


    public char getGrade() {
        return grade;
    }
}
