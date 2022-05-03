package midterm_project;

public class Student {
    private int studentId;
    private String name;
 
    public Student(int id, String name) {
        this.studentId = id;
        this.name = name;
    }
 
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int id) {
        this.studentId = id;
    }
    public String getName() {
        return name;
    }
    public void setStudentName(String name) {
        this.name = name;
    }
}
