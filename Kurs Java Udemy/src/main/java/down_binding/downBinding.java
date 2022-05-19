package down_binding;

public class downBinding {
    public static void main(String[] args) {
        Person[] personTab = new Person[5];

        // Person jest klasą abstrakcyjną, nie możemy stworzyć jej instancji.
        // Aczkolwiek można stworzyć tablicę przechowującą obiekty person i ich dzieci jak powyżej.

//        Person personTest = new Person();
        personTab[0] = new Employee("John", "Kowalski", 6000);
        personTab[1] = new Student("Stanley", "Kubrick", "PW");
        personTab[2] = new Employee("Matt", "Damon", 70000);
        personTab[3] = new Student("Martin", "Brown", "WAT");
        personTab[4] = new Employee("Robert", "Lewandowski", 150000);

        for (Person person: personTab){
            System.out.println(person.getInfo() + "\n");
            // DOWN-BINDING
            ((Employee)person).work();
        }


//          DOWNCASTING DOWNBINDING
        for (Person person: personTab) {
            if (person instanceof Employee tmpEmployee) {
                System.out.println(((Employee)person).getInfo() + "\n");
                tmpEmployee.work();
            }
        }
    }
}
