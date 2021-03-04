package MainClasses;

public class Student {
    private String studentName;
    private int age;
    private boolean isScienceMajor;
    private char gender;

    Student() {
        this(null, 0, false, '\u0000');
    }

    Student(String studentName, int age, boolean isScienceMajor, char gender) {
        this.setStudentName(studentName);
        this.setAge(age);
        this.setIsScienceMajor(isScienceMajor);
        this.setGender(gender);
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsScienceMajor() {
        return this.isScienceMajor;
    }

    public void setIsScienceMajor(boolean isScienceMajor) {
        this.isScienceMajor = isScienceMajor;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
