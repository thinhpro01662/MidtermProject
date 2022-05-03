package midterm_project;

import java.util.List;

public interface StudentDAO {
    public List<Student> getAllStudents();
    public Student getStudentById(int id);
    public void addStudent(Student e);
    public void updateStudent(Student e);
    public void deleteStudent(Student e);
}
