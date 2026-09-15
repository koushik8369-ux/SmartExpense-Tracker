import java.util.Scanner;

public class InsurancePremiumEstimator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("  HEALTH INSURANCE PREMIUM ESTIMATOR");
        System.out.println("====================================");

        System.out.print("Enter applicant name: ");
        String applicantName = scanner.nextLine();

        System.out.print("Enter applicant age: ");
        int age = scanner.nextInt();

        System.out.print("Enter required coverage amount: Rs. ");
        double coverageAmount = scanner.nextDouble();

        System.out.print("Does the applicant smoke? (yes/no): ");
        String smokerInput = scanner.next();

        System.out.print("Any existing medical condition? (yes/no): ");
        String medicalInput = scanner.next();

        if (applicantName.trim().isEmpty()) {
            System.out.println("Applicant name cannot be empty.");
            scanner.close();
            return;
        }

        if (age < 18 || age > 80 || coverageAmount <= 0) {
            System.out.println("Please enter valid age and coverage details.");
            scanner.close();
            return;
        }

        boolean validSmokerInput =
                smokerInput.equalsIgnoreCase("yes")
                || smokerInput.equalsIgnoreCase("no");

        boolean validMedicalInput =
                medicalInput.equalsIgnoreCase("yes")
                || medicalInput.equalsIgnoreCase("no");

        if (!validSmokerInput || !validMedicalInput) {
            System.out.println("Please answer smoking and medical questions with yes or no.");
            scanner.close();
            return;
        }

        boolean smoker = smokerInput.equalsIgnoreCase("yes");
        boolean hasMedicalCondition =
                medicalInput.equalsIgnoreCase("yes");

        double basePremium = coverageAmount * 0.02;
        double ageCharge = 0;
        double smokingCharge = 0;
        double medicalCharge = 0;

        if (age >= 60) {
            ageCharge = basePremium * 0.60;
        } else if (age >= 45) {
            ageCharge = basePremium * 0.40;
        } else if (age >= 30) {
            ageCharge = basePremium * 0.20;
        }

        if (smoker) {
            smokingCharge = basePremium * 0.30;
        }

        if (hasMedicalCondition) {
            medicalCharge = basePremium * 0.25;
        }

        double annualPremium =
                basePremium + ageCharge
                + smokingCharge + medicalCharge;

        double monthlyPremium = annualPremium / 12;

        System.out.println();
        System.out.println("--------- PREMIUM ESTIMATE ---------");
        System.out.printf("Applicant Name     : %s%n", applicantName);
        System.out.printf("Applicant Age      : %d%n", age);
        System.out.printf("Coverage Amount    : Rs. %.2f%n", coverageAmount);
        System.out.printf("Smoker             : %s%n",
                smoker ? "Yes" : "No");
        System.out.printf("Medical Condition  : %s%n",
                hasMedicalCondition ? "Yes" : "No");
        System.out.println("------------------------------------");
        System.out.printf("Base Premium       : Rs. %.2f%n", basePremium);
        System.out.printf("Age Charge         : Rs. %.2f%n", ageCharge);
        System.out.printf("Smoking Charge     : Rs. %.2f%n", smokingCharge);
        System.out.printf("Medical Charge     : Rs. %.2f%n", medicalCharge);
        System.out.println("------------------------------------");
        System.out.printf("Estimated Annual Premium : Rs. %.2f%n",
                annualPremium);
        System.out.printf("Estimated Monthly Premium: Rs. %.2f%n",
                monthlyPremium);
        System.out.println("------------------------------------");

        if (!smoker && !hasMedicalCondition && age < 30) {
            System.out.println("Risk Level: LOW");
        } else if (smoker && hasMedicalCondition) {
            System.out.println("Risk Level: HIGH");
        } else {
            System.out.println("Risk Level: MODERATE");
        }

        System.out.println();
        System.out.println("Note: This is an educational estimate only.");
        System.out.println("Actual premiums depend on the insurance provider.");
        System.out.println("====================================");
        scanner.close();
    }
}