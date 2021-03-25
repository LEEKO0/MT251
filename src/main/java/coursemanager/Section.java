package coursemanager;
import java.util.HashMap;
class Section
    {
        int section;
        String course;
        CourseManager.Teacher instructor;
        int size;
        HashMap<Integer ,CourseManager.Student > students;
    private CourseManager.Teacher t1;
    private CourseManager.Teacher t2;
    private CourseManager.Teacher t3;
    private CourseManager.Teacher t4;
    private CourseManager.Teacher t5;
    private CourseManager.Teacher t6;
    private CourseManager.Teacher t7;
        //constructor
        public Section(int section , String course , CourseManager.Teacher instructor)
        {
            this.section = section;
            this.course = course;
            instructor = this.instructor;
            students = new HashMap<>();
            this.size = 0;
        }
        //Some Section
        CourseManager.Section sec1 = new CourseManager.Section(1103,"M54",t1);        
        CourseManager.Section sec2 = new CourseManager.Section(1205,"C11",t2);
        CourseManager.Section sec3 = new CourseManager.Section(1101,"TM111",t3);
        CourseManager.Section sec4 = new CourseManager.Section(1202,"TM105",t4);        
        CourseManager.Section sec5 = new CourseManager.Section(1305,"El112",t5);        
        CourseManager.Section sec6 = new CourseManager.Section(1204,"Ar111",t6);       
        CourseManager.Section sec7 = new CourseManager.Section(1105,"Tu170",t7);
}
