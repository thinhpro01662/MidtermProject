package midterm_project;
import java.util.List;
import java.util.ArrayList;

public class StudentDAOImp implements StudentDAO{
    List<Student> studentList;
    
    public StudentDAOImp() {
        studentList = new ArrayList<Student>();
        Student s1 = new Student(558, "Tai");
        Student s2 = new Student(777, "Tri");
        Student s3 = new Student(571, "Thinh");
        Student s4 = new Student(535, "Long");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
    }
    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }
    @Override
    public Student getStudentById(int id) {
        return studentList.get(id);
    }
    @Override
    public void addStudent(Student e) {
        studentList.add(e);
        System.out.println("Updated successfully" + e.getName());
    }
    @Override
    public void updateStudent(Student e) {
        studentList.get(e.getStudentId()).setStudentName(e.getName());
        System.out.println("Updated successfully, Student id: " + e.getStudentId());
    }
    @Override
    public void deleteStudent(Student e) {
        studentList.remove(e.getStudentId());
        System.out.println("Delete successfully: " + e.getName() + "Student id: " + e.getStudentId());
    }
}
