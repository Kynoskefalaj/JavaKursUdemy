package down_binding;

public class Student extends Person {
    String university;

    public Student (String firstName, String lastName, String university){
        this.firstName = firstName;
        this.lastName = lastName;
        this.university = university;
    }
    @Override
    public String getInfo(){
        return ("Imię: " + this.firstName + "\n" + "Nazwisko: "
                + this.lastName + "\n" + "Uczelnia: " + this.university);
    }
}
