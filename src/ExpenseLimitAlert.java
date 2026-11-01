import java.util.Scanner;

public class ExpenseLimitAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly expense limit: Rs. ");
        double limit = sc.nextDouble();

        System.out.print("Enter current expenses: Rs. ");
        double expense = sc.nextDouble();

       

        sc.close();
    }
}
