public class Main {
    public static void main(String[] args) {


        Student student = new Student("Hannah",'A',1);

        System.out.println("Name "+ student.getName());
        System.out.println("Grade " +student.getGrade());
        System.out.println("Change Grade "  );
        student.setGrade('D');
        System.out.println("New Grade  " +student.getGrade());








    }
}