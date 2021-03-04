package MainClasses;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    Course(String courseName, String[] students, int numberOfStudents) {
        this.courseName = courseName;
        this.numberOfStudents = numberOfStudents;
        this.addStudent(students);
    }

    Course() {
        this(null, null, 0);
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String[] getStudents() {
        return this.students;
    }

    public String getStudent(int i) {
        return this.students[i];
    }

    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public void addStudent(String[] students) {
        this.students = new String[this.getNumberOfStudents()];
        for (int i = 0; i < this.getNumberOfStudents(); i++)
            this.students[i] = students[i];
    }
}
