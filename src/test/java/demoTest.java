import Model.Student;

public class demoTest {
    public static void main(String[] args){
        Student student = new Student();
        student.setID_NO("abcd-123456");
        student.setAge(22);
        student.setGender("male");
        student.setName("Bob");
        System.out.println(student.toString());
    }
}
