
package coursemanager;

import java.util.HashMap;

class Teacher extends CourseManager.Person{
        int id;
        
        public Teacher(int id , String name , int age )
        {
            super(name , age);
            this.id = id;
        }
        //some teacher object
        CourseManager.Teacher t1 = new CourseManager.Teacher(1234 , "Dr.Lamia" ,38);
        CourseManager.Teacher t2 = new CourseManager.Teacher(1000 , "Dr.Saly" ,40);
        CourseManager.Teacher t3 = new CourseManager.Teacher(1945 , "Dr.Shikhan" ,45);
        CourseManager.Teacher t4 = new CourseManager.Teacher(5876 , "Dr.Daniah" ,37);
        CourseManager.Teacher t5 = new CourseManager.Teacher(1941 , "Dr.Ahmad" ,48);
        CourseManager.Teacher t6 = new CourseManager.Teacher(1955 , "Dr.Areej" ,32);
        CourseManager.Teacher t7 = new CourseManager.Teacher(2135 , "Dr.Mona" ,35);
    }
