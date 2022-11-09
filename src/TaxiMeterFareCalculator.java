import java.util.Scanner;

public class TaxiMeterFareCalculator {

    public static void main(String[] args) {
         /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */


        // Declare double variables
        int km;
        double perKm = 2.20, total, startPrice = 10;

        // Create a new object
        Scanner input = new Scanner ( System.in);

        // Prompt the user to input integer
        System.out.print ( " Enter distance : " );
        km = input.nextInt ();

        // Calculate taxi fare
        total = ( km * perKm );
        total += startPrice;

        // Check taxi fare
        total = ( total < 20 ) ? 20 : total;

        // Display result
        System.out.println(" Total " + total );
    }
}
