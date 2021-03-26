package TMA;

import java.util.*;

/**
 * this abstract class is for everyone in
 */
public abstract class CollegePerson extends Object {
    private String id;
    private String fullName;
    private int age;
    private boolean isMale;

    public CollegePerson() {
        this(null, 0, false);
    }

    public CollegePerson(String fullName, int age, boolean isMale) {
        this.setFullName(fullName);
        this.setIsMale(isMale);
        this.setAge(age);
        if (this instanceof Instructor)
            this.setId("INST" + gen());
        if (this instanceof Student)
            this.setId("STUD" + gen());
    }

    /**
     * writing getter and setter for all properties
     */
    public String getId() {
        return this.id;
    }

    /**
     * settre id will be private access, because when we create a new College Person
     * we will generate a random id for College Person, if it was Instructor we will
     * add INST before his number, and if it was Student we will put STUD before his
     * number
     * 
     * @param id
     */
    private void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean getIsMale() {
        return this.isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
     * * this method generate a random id for every College Person
     */
    private static int gen() {
        Random r = new Random(System.currentTimeMillis());
        return 10000 + r.nextInt(20000);
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + "\t\t" + "Full Name: " + this.getFullName() + "\t" + "Age: " + this.getAge()
                + "\t\t" + "Gender: " + (this.getIsMale() ? "Male" : "Female") + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CollegePerson) {
            CollegePerson collegePerson = (CollegePerson) o;
            return this.getId() == collegePerson.getId() && this.getFullName().equals(collegePerson.getFullName())
                    && this.getIsMale() == collegePerson.getIsMale();
        }
        return false;
    }
}
