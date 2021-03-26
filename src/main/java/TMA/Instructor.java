package TMA;

import java.util.*;

public class Instructor extends CollegePerson {
    private String biography;

    public Instructor() {
        this(null, 0, false, null);
    }

    public Instructor(String fullName, int age, boolean isMale, String biograhpy) {
        super(fullName, age, isMale);
    }

    /**
     * getter and setter for all properties
     *
     * @return
     */
    public String getBiography() {
        return this.biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    /**
     * This method will add a new instructor in the specific section,after the
     * calling method we will take the section as an argument then, we create a new
     * Instructor obj and ask the user to enter the whole data for the Instructor,
     * finally we add and update the Instructor of section.
     * 
     * @param section
     */
    public static void addNewIntrecotr(Section section) {
        Instructor instructor = new Instructor();

        System.out.println("\n**************************");
        System.out.println("Fill infromation for instructor: ");
        System.out.println("**************************\n");

        System.out.print("Full Name: ");
        instructor.setFullName(Registration.input.nextLine().trim());
        instructor.setFullName(Registration.input.nextLine().trim());

        System.out.print("Gender M / F: ");
        instructor.setIsMale(Registration.input.next().toUpperCase().equals("M"));

        System.out.print("Biography: ");
        String bString = Registration.input.nextLine().trim();
        bString = Registration.input.nextLine();
        instructor.setBiography(bString);

        System.out.print("Age: ");
        instructor.setAge(Registration.input.nextInt());
        System.out.println();
        section.setInstructor(instructor);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Instructor)
            if (super.equals(o)) {
                Instructor instructor = (Instructor) o;
                return this.getBiography().equals(instructor.getBiography());
            }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "Biography: " + this.getBiography();

    }
}
