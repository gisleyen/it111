
public class GallonsLiters {

    public static void main(String[] args) {

        double Gallons; // holds the number of gallons
        double Liters; // holds conversion to liters


        int counter = 0;

        for (Gallons = 1; Gallons <= 100; Gallons += 4) {

            Liters = (Gallons * 3.79);

            if (Gallons==1.0) {
                System.out.printf( "%.2f Liters = %.2f Gallon \n" , Liters, Gallons);

            }
            else {
                System.out.printf( "%.2f Liters = %.2f Gallons \n" , Liters, Gallons);
            }





            if (counter % 5 == 4) {
                System.out.println("");
            }
            counter = counter + 1;


        }// end for loop

        System.out.println("We are done!!!!");
    }
}





