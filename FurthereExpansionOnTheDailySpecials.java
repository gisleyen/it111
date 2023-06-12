import java.util.Scanner;

public class FurthereExpansionOnTheDailySpecials {
    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a week day, excluding weekends ");

        specials = input.next();

        // Validate input and prompt until a valid day is entered
        while (!(specials.equals("Monday") || specials.equals("Tuesday") || specials.equals("Wednesday") ||
                specials.equals("Thursday") || specials.equals("Friday"))) {
            System.out.println("Please enter a valid day of the week ");
            specials = input.next();
        }

        String coffee = "";
        double price = 0.0;

        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
            }
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
            }
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
            }
        }

        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

        System.out.println("How many " + coffee + "s would you like to order?");
        int amount = input.nextInt();

        if (amount == 0) {
            System.out.println("Looks like you don't like " + coffee + "! So sad!!");
        } else if (amount >= 1 && amount <= 4) {
            double total = amount * price;
            System.out.printf("Looks like you will be ordering only %d %s today totaling $%.2f dollars%n",
                    amount, coffee, total);
        } else if (amount >= 5 && amount < 10) {
            double regularPrice = amount * price;
            double total = regularPrice * 0.9; // Apply 10% discount
            System.out.printf("Group discount applied! Your regular price is $%.2f.%n", regularPrice);
            System.out.printf("You have ordered %d %ss but will be only charged $%.2f dollars!%n",
                    amount, coffee, total);
        } else if (amount >= 10) {
            double regularPrice = amount * price;
            double total = regularPrice * 0.8; // Apply 20% discount
            System.out.printf("A bigger group discount! Your regular price is $%.2f.%n", regularPrice);
            System.out.printf("You have ordered %d %ss but will be only charged $%.2f dollars!%n",
                    amount, coffee, total);
        }
    }
}
