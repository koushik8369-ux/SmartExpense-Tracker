import java.util.Scanner;

public class SalaryAllocationPlanner {

    private String employeeName;
    private double grossSalary;
    private double deductions;

    public SalaryAllocationPlanner(String employeeName,
            double grossSalary, double deductions) {
        this.employeeName = employeeName;
        this.grossSalary = grossSalary;
        this.deductions = deductions;
    }

    public double calculateNetSalary() {
        return grossSalary - deductions;
    }

    public double calculateDeductionPercentage() {
        return deductions / grossSalary * 100;
    }

    public void displayReport() {
        double netSalary = calculateNetSalary();

        System.out.println();
        System.out.println("--------- SALARY SUMMARY ---------");
        System.out.printf("Employee Name        : %s%n", employeeName);
        System.out.printf("Gross Salary         : Rs. %.2f%n", grossSalary);
        System.out.printf("Total Deductions     : Rs. %.2f%n", deductions);
        System.out.printf("Deduction Percentage : %.2f%%%n",
                calculateDeductionPercentage());
        System.out.printf("Net Salary           : Rs. %.2f%n", netSalary);
        System.out.println("----------------------------------");
        System.out.println("     RECOMMENDED ALLOCATION");
        System.out.printf("Essentials (50%%)     : Rs. %.2f%n", netSalary * 0.50);
        System.out.printf("Savings (20%%)        : Rs. %.2f%n", netSalary * 0.20);
        System.out.printf("Investments (15%%)    : Rs. %.2f%n", netSalary * 0.15);
        System.out.printf("Personal Use (10%%)   : Rs. %.2f%n", netSalary * 0.10);
        System.out.printf("Emergency Fund (5%%)  : Rs. %.2f%n", netSalary * 0.05);
        System.out.println("----------------------------------");

        if (calculateDeductionPercentage() > 30) {
            System.out.println("Alert: Salary deductions are very high.");
        } else if (calculateDeductionPercentage() > 15) {
            System.out.println("Status: Salary deductions are moderate.");
        } else {
            System.out.println("Status: Salary deductions are under control.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Employee name cannot be empty.");
            sc.close();
            return;
        }

        System.out.print("Enter monthly gross salary: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Enter a valid salary amount.");
            sc.close();
            return;
        }
        double salary = sc.nextDouble();

        System.out.print("Enter tax and other deductions: Rs. ");
        if (!sc.hasNextDouble()) {
            System.out.println("Enter a valid deduction amount.");
            sc.close();
            return;
        }
        double deductions = sc.nextDouble();

        if (!Double.isFinite(salary) || !Double.isFinite(deductions)
                || salary <= 0 || deductions < 0 || deductions >= salary) {
            System.out.println("Enter valid salary details. Deductions must be less than salary.");
            sc.close();
            return;
        }

        SalaryAllocationPlanner planner =
                new SalaryAllocationPlanner(name, salary, deductions);
        planner.displayReport();
        sc.close();
    }
}
