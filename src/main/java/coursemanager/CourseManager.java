package coursemanager;

import java.util.*;
class CourseManager{
    //toatl students each section can hold
    static int max_Students;
    //mapping of each sections w.r.t to course
    HashMap<String,ArrayList<Section> > courses ;
    
    //constructor for CourseManager
    public CourseManager(int max){
        max_Students = max;
        courses = new HashMap<>();
    }
    //class Person which will be used by teacher and students to inherit its properties
    static class Person{
        String name;
        int age;
        
        public Person(String name , int age )
        {
            this.name = name;
            this.age = age;
        }
    }
    //teacher class
    static class Teacher extends Person{
        int id;
        
        public Teacher(int id , String name , int age )
        {
            super(name , age);
            this.id = id;
        }
    }
    //student class
    static class Student extends Person{
        int id;
        
        public Student(int id , String name , int age )
        {
            super(name , age);
            this.id = id;
        }
    }
    //section class
    static class Section
    {
        int section;
        String course;
        Teacher instructor;
        int size;
        HashMap<Integer ,Student > students;
        //constructor
        public Section(int section , String course , Teacher instructor)
        {
            this.section = section;
            this.course = course;
            instructor = this.instructor;
            students = new HashMap<>();
            this.size = 0;
        }
        //function to add students
        public void addStudent(int id ,Student s1)
        {
            if(students.containsKey(id) || size == max_Students)
            {
                System.out.println("Adding student to Section is not succesful");
            }
            else
            {
                students.put(id ,s1);
                size++;
                System.out.println("Adding student to Section is succesful");
            }
        }
        //function to remove student
        public void removeStudent(int id )
        {
            if(!students.containsKey(id) || size == 0)
            {
                System.out.println("Removing student from Section is not succesful");
            }
            else
            {
                students.remove(id);
                size--;
                System.out.println("Removing student from Section is succesful");
            }
        }
    }
    // function of course manager to map section with their courses
    public void addSection(String course , Section s)
    {
        if(!courses.containsKey(course))
            courses.put(course,new ArrayList<Section>());
        courses.get(course).add(s);
    }
    //function to display the section w.r.t its courses
    public void DisplaySection()
    {
        for(String key : courses.keySet())
        {
            System.out.print("Courses with sections : ");
            for(Section s : courses.get(key))
            {
                System.out.print(s.section +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        //course manager object
        CourseManager cm = new CourseManager(2);
        //some students object
        Student s1 = new Student(123, "Dalal" ,20);
        Student s2 = new Student(456 , "Noura" ,18);
        Student s3 = new Student(789 , "Ahlam" ,19);
        Student s4 = new Student(901 , "Jereey" ,17);
        Student s5 = new Student (117 , "Dania" ,19);
        Student s6 = new Student (897 , "Marwan" ,23);
        Student s7 = new Student (452 , "Rayan" ,22);
        Student s8 = new Student (334 , "Wejdan" ,20);
        Student s9 = new Student (666 , "Keyan" ,22);
        Student s10 = new Student (766 , "Abdulrahman" ,21);
        Student s11 = new Student (431 , "Ammar" ,18);
        Student s12 = new Student (611 , "Abdulrahman" ,24);
        Student s13 = new Student (333 , "Saleh" ,22);
        Student s14 = new Student (808 , "Eyan" ,23);
        Student s15 = new Student (554 , "Tammer" ,20);
        Student s16 = new Student (111 , "Bushra" ,21);
        Student s17 = new Student (222 , "Leen" ,18);
        
        //some teacher object
        Teacher t1 = new Teacher(1234 , "Dr.Lamia" ,38);
        Teacher t2 = new Teacher(1000 , "Dr.Saly" ,40);
        Teacher t3 = new Teacher(1945 , "Dr.Shikhan" ,45);
        Teacher t4 = new Teacher(5876 , "Dr.Daniah" ,37);
        Teacher t5 = new Teacher(1941 , "Dr.Ahmad" ,48);
        Teacher t6 = new Teacher(1955 , "Dr.Areej" ,32);
        Teacher t7 = new Teacher(2135 , "Dr.Mona" ,35);
        Teacher t8 = new Teacher(7869, "Dr.Khaled" ,40);
        Teacher t9 = new Teacher(7869, "Dr.Asmaa" ,37);
        Teacher t10 = new Teacher(7869, "Dr.Waleed" ,41);
        
        //creating section and mapping them with the courses
        Section sec1 = new Section(1103,"M54",t1);
        cm.addSection("M54", sec1);
        Section sec2 = new Section(1205,"C11",t2);
        cm.addSection("M55", sec2);
        Section sec3 = new Section(1101,"TM111",t3);
        cm.addSection("M56", sec3);
        Section sec4 = new Section(1202,"TM105",t4);
        cm.addSection("M57", sec4);
        Section sec5 = new Section(1305,"El112",t5);
        cm.addSection("M58", sec5);
        Section sec6 = new Section(1204,"Ar111",t6);
        cm.addSection("M59", sec6);
        Section sec7 = new Section(1105,"Tu170",t7);
        cm.addSection("M60", sec7);
        Section sec8 = new Section(1111,"M251",t8);
        cm.addSection("M61", sec8);
        Section sec9 = new Section(2145,"TM112",t9);
        cm.addSection("M62", sec9);
        Section sec10 = new Section(1333,"M109",t10);
        cm.addSection("M63", sec10);
        
        
        //adding and removing students
        sec1.addStudent(123, s1);
        sec1.addStudent(456, s2);
        sec1.addStudent(789, s3);
        sec1.removeStudent(123);
        sec2.addStudent(901, s4);
        sec3.addStudent (897, s7);
        sec7.removeStudent(117);
        sec10.addStudent(222, s5);
        
        //display the section w.r.t its courses
        cm.DisplaySection();
    }
}