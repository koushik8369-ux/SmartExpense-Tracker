import java.util.Scanner;

public class MovieTicketAgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      MOVIE TICKET AGE CHECK");
        System.out.println("================================");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 5) {
            System.out.println("Ticket Status: Free entry for young children.");
        } else if (age < 18) {
            System.out.println("Ticket Status: Child/Teen ticket required.");
        } else {
            System.out.println("Ticket Status: Adult ticket required.");
        }

        System.out.println("================================");

        scanner.close();
    }
}
