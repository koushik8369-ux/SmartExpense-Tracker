import java.util.Scanner;

public class SalaryAllocationPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      SALARY ALLOCATION PLANNER");
        System.out.println("====================================");

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter monthly gross salary: Rs. ");
        double grossSalary = scanner.nextDouble();

        System.out.print("Enter tax and other deductions: Rs. ");
        double deductions = scanner.nextDouble();

        if (employeeName.trim().isEmpty()) {
            System.out.println("Employee name cannot be empty.");
            scanner.close();
            return;
        }

        if (grossSalary <= 0 || deductions < 0) {
            System.out.println("Please enter valid salary details.");
            scanner.close();
            return;
        }

        if (deductions >= grossSalary) {
            System.out.println("Deductions must be lower than the gross salary.");
            scanner.close();
            return;
        }

        double netSalary = grossSalary - deductions;

        double essentials = netSalary * 0.50;
        double savings = netSalary * 0.20;
        double investments = netSalary * 0.15;
        double personalSpending = netSalary * 0.10;
        double emergencyFund = netSalary * 0.05;

        double deductionPercentage =
                (deductions / grossSalary) * 100;

        System.out.println();
        System.out.println("--------- SALARY SUMMARY ---------");
        System.out.printf("Employee Name        : %s%n", employeeName);
        System.out.printf("Gross Salary         : Rs. %.2f%n", grossSalary);
        System.out.printf("Total Deductions     : Rs. %.2f%n", deductions);
        System.out.printf("Deduction Percentage : %.2f%%%n", deductionPercentage);
        System.out.printf("Net Salary           : Rs. %.2f%n", netSalary);
        System.out.println("----------------------------------");
        System.out.println("     RECOMMENDED ALLOCATION");
        System.out.printf("Essentials (50%%)     : Rs. %.2f%n", essentials);
        System.out.printf("Savings (20%%)        : Rs. %.2f%n", savings);
        System.out.printf("Investments (15%%)    : Rs. %.2f%n", investments);
        System.out.printf("Personal Use (10%%)   : Rs. %.2f%n", personalSpending);
        System.out.printf("Emergency Fund (5%%)  : Rs. %.2f%n", emergencyFund);
        System.out.println("----------------------------------");

        if (deductionPercentage > 30) {
            System.out.println("Alert: Salary deductions are very high.");
        } else if (deductionPercentage > 15) {
            System.out.println("Status: Salary deductions are moderate.");
        } else {
            System.out.println("Status: Salary deductions are under control.");
        }

        System.out.println("==================================");
        scanner.close();
    }
}