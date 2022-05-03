package midterm_project;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDao = new StudentDAOImp();
 
        for(Student student : studentDao.getAllStudents()) {
            System.out.println("Student Info: |Name: " + student.getName() + ", ID: " + student.getStudentId() + "|");
        }
        System.out.println("--------------------------------");
    }
}
