import java.util.Scanner;

public class dailySpecials {

    public static void main(String[]args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends(Monday-Friday only!)");

        specials = input.next();

        //in the world of coffee, I need a name of a coffee beverage and a price

        String coffee = "";
        double price= 0.0;

        boolean Saturday = specials.equals("Saturday");
        boolean Sunday = specials.equals("Sunday");

        if (Saturday || Sunday) {
            System.out.println("Please enter a week day, not weekend!");
            specials = input.next();
        }


        switch (specials) {
            //my cases will be the day of the week

            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

            }
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

            }

            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

            }

            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);

            }
            default -> {
                System.out.println("Please enter a week day, not weekend!");
            }


        }
        System.out.println("How many " + coffee + "s would you like to order?");

   int amount=input.nextInt();

   if (amount== 0) {
       System.out.println("Looks like you don't like " + coffee + " ! So sad!!");

   } else if (amount== 1) {
       System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
   } else {
       System.out.printf( amount + " " +coffee + "s have been ordered totalling \n$%.2f dollars \n" , amount*price);
   }
    }



}

