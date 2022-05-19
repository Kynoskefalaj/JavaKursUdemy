package down_binding;

public class Employee extends Person {
    double salary;

    public Employee (String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    @Override
    public String getInfo(){
        return ("Imię: " + this.firstName + "\n" + "Nazwisko: "
                + this.lastName + "\n" + "Zarobki: " + this.salary);
    }

    public void work(){
        System.out.println("Pracu, pracu, pracu...");
    }
}
