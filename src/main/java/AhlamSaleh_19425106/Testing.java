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

        Section sec = new Section();
        Instructor Sally = new Instructor();
        Sally.setName("Ahlam");
        Sally.setAge(25);
        Sally.setId(22);

        Section sec2 = new Section(1305, "M251", Sally, 2);
        Section.addStudentSection(sec);
        System.out.println(sec2.toString());

    }
}
