/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhlamSaleh_19425106;

/**
 *
 * @author WELCOME
 */
public class Testing {

    public static void main(String[] args) {
        int add = -1;
        Section sec = new Section();
        Instructor S = new Instructor();
        S.setName("Sally");
        S.setAge(25);
        S.setId(22);
        S.setIsEngineer(true);
        S.setgender(true);
        S.setheight(165);
        Section sec2 = new Section(1305, "M251", S, 2);
        Student s = null;
        do {
            Section.addStudentSection(sec);
            System.out.println("In order to add another student press 0");
            add = Data.input.nextInt();

        } while (add == 0);
        s = sec.getStudents().get(0);
        System.out.println(s);
        System.out.println(s.equals(s));
        /*
         * Section.removeStudent(sec.getStudents().get(0), sec);
         * System.out.println(sec.toString());
         */

    }
}
