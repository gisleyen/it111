package package_person_homework;

public class PersonRegular {

        public static void main(String[] args) {
            // To create our variables
            String firstPersonName = "Carol Ben";
            String secondPersonName = "Jack Smith";
            int firstPersonAge = 30;
            int secondPersonAge = 20;
            int firstPersonCarYear = 2017;
            int secondPersonCarYear = 2020;
            boolean firstPersonViolations = false;
            boolean secondPersonViolations = true;
            double firstPersonCreditScore = 690.0;
            double secondPersonCreditScore = 500.0;

            double monthlyRate1;
            double monthlyRate2;
            double adjustedRate1;
            double adjustedRate2;

            // Logic in the car insurance industry - if you have traffic tickets, DUIs, other
            // violations, you will be paying more for your insurance
            // Also, if the car is newer, the monthly premiums will be higher

            if (firstPersonViolations && firstPersonCreditScore <= 700) {
                monthlyRate1 = 500;
            } else {
                monthlyRate1 = 100;
            }

            if (secondPersonViolations && secondPersonCreditScore <= 700) {
                monthlyRate2 = 500;
            } else {
                monthlyRate2 = 100;
            }

            // Adding condition for the car's age
            int currentYear = 2023; // Current year
            double carAgeDiscount = 0.25; // Discount rate for older cars

            if (currentYear - firstPersonCarYear < 5) {
                adjustedRate1 = monthlyRate1;
            } else {
                adjustedRate1 = monthlyRate1 + (monthlyRate1 * carAgeDiscount);
            }

            if (currentYear - secondPersonCarYear < 5) {
                adjustedRate2 = monthlyRate2;
            } else {
                adjustedRate2 = monthlyRate2 + (monthlyRate2 * carAgeDiscount);
            }

            double total1 = adjustedRate1;
            double total2 = adjustedRate2;

            System.out.println("Your name: " + firstPersonName);
            System.out.println("Your age: " + firstPersonAge);
            System.out.println("Your car: " + firstPersonCarYear);
            System.out.println("Your violations: " + firstPersonViolations);
            System.out.println("Your Credit Score: " + firstPersonCreditScore);
            System.out.println(total1 + " dollars");
            System.out.println();

            System.out.println("Your name: " + secondPersonName);
            System.out.println("Your age: " + secondPersonAge);
            System.out.println("Your car: " + secondPersonCarYear);
            System.out.println("Your violations: " + secondPersonViolations);
            System.out.println("Your Credit Score: " + secondPersonCreditScore);
            System.out.println(total2 + " dollars");
        }
    }


