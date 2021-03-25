package AhlamSaleh_19425106;

import java.util.*;

public class Section {

    // below are the attributes used in the code.
    private int SectionNo;
    private String CourseCode;
    private Instructor Inst = new Instructor();
    private ArrayList<Student> Students = new ArrayList<Student>();

    private static final int maximum = 250;
    private int LectureTime;
    private Date Date;

    // 2 attributes
    Section() {

    }

    public Section(int SectionNo, String CourseCode, Instructor Inst, int LectureTime) {
        this.SectionNo = SectionNo;
        this.CourseCode = CourseCode;
        this.Inst = Inst;
        this.LectureTime = LectureTime;
        Date = new Date();
    }

    public int getSection() {
        return this.SectionNo;
    }

    public void setSection(int SectionNo) {
        this.SectionNo = SectionNo;
    }

    public String getCourseCode() {
        return this.CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public Instructor getInst() {
        return this.Inst;
    }

    public void setInst(Instructor Inst) {
        this.Inst = Inst;
    }

    public int getLectureTime() {
        return LectureTime;
    }

    public void setLectureTime(int LectureTime) {
        this.LectureTime = LectureTime;
    }

    public Date getDate() {
        return this.Date;
    }

    public static void addSection(ArrayList<Section> sections) {

        Section sec = new Section();
        System.out.println("1- Enter Section no:");
        int SectionNo = Data.input.nextInt();
        System.out.println("2- Enter Course Code:");
        String CourseCode = Data.input.nextLine();
        sec.setSection(SectionNo);
        sec.setCourseCode(CourseCode);

        for (Section section : sections) {
            if (section.equals(sec)) {
                System.out.println("Section already available, Section not added");
            } else {

                System.out.println("Section is added");
            }
        }

    }

    public void addStudent(Student s) {
        boolean Exists = false;
        if (Students.size() > maximum) {
            System.out.println("The section is full, can't add student.");

        } else {

            for (Student Stud : Students) {
                if (Stud.equals(s)) {
                    System.out.println("Student is not added successfully");
                    Exists = true;
                    break;
                }

            }
            if (Exists == false) {
                Students.add(s);
                System.out.println("Student added successfully");
            }

        }
    }

    public static void addStudentSection(Section sec) {
        Student a = new Student();
        System.out.println("1- Enter Student Name:");
        String Name = Data.input.nextLine();
        System.out.println("2- Enter Student Id:");
        int Id = Data.input.nextInt();
        System.out.println("3- Enter Student Section:");
        String sectionNo = Data.input.nextLine();
        sectionNo = Data.input.nextLine();
        System.out.println("4- Enter Student Year:");
        int year = Data.input.nextInt();
        sec.addStudent(a);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Section) {
            Section sc = (Section) o;

            return sc.getCourseCode().equals(this.CourseCode) && sc.getSection() == this.SectionNo;

        }
        return false;
    }

    @Override
    public String toString() {
        return "SectionNo=" + SectionNo + ", CourseCode=" + CourseCode + ", Inst=" + getInst() + ", Students="
                + Students + ", LectureTime=" + LectureTime + ", Date=" + Date;
    }

}
/*
 * 
 * public void removeStudent(Student stud) { if (!Student.contains(stud))
 * Student.remove(stud); else System.out.println("Student is not available "); }
 * public void AverageStudent() {
 * 
 * }
 * 
 * public void DisplaySection() {
 * 
 * }
 * 
 * @Override public String toString() { return ""; }
 */
