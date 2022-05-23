import java.util.ArrayList;

public class PASMain {
    public static void main(String[] args) {

        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        Student Ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(Ollie);
        System.out.println("Study credits " + Ollie.credits());
        Ollie.study();

        System.out.println("Study credits " + Ollie.credits());
        System.out.println(Ollie);
        Ollie.study();
        System.out.println(Ollie);

        Teacher Ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher Esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            Ollie.study();
            i = i + 1;
        }

        System.out.println(Ollie);
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    private static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
            ;
        }
    }
}