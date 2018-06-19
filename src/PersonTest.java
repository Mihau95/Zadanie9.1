import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;

        do {
            loop = true;
            try {
                System.out.println("Imię: ");
                String firstName = scanner.nextLine();
                System.out.println("Nazwisko: ");
                String lastName = scanner.nextLine();
                System.out.println("Wiek: ");
                int age = scanner.nextInt();
                System.out.println("PESEL: ");
                scanner.nextLine();
                String pesel = scanner.nextLine();
                Person person = new Person(firstName, lastName, age, pesel);
                System.out.println(person.toString());
            } catch (NameUndefinedException e) {
                System.out.println(e.getMessage());
                loop = false;
            } catch (IncorrectAgeException e) {
                System.out.println(e.getMessage());
                loop = false;
            }
        } while (!loop);
    }
}