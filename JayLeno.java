import java.util.*;

public class JayLeno{

   public static void main(String[] args)
   {
      int numCars = 0;
      Scanner scan = new Scanner (System.in);
      Car[] garage = new Car[100];     
      for (int index = 0; index < garage.length; index++)
      {
         System.out.println("Enter the make: ");
         String make = scan.next();
         System.out.println("Enter the model: ");
         String model = scan.next();
         System.out.println ("Enter the year: ");
         int year = scan.nextInt();
         System.out.println ("Enter the tranmission code: ");
         System.out.println("0 for manual, 1 for automatic: ");
         int transCode = scan.nextInt();
         //scan.next();//consume the <enter> in input stream
         garage[index] = new Car(make, model, year, transCode);
         String choice = "n";
         System.out.println("Enter n if you want to quit: ");
         numCars = index + 1;
         if (choice.equals(scan.next()))
            break;
      }

      //print out the contents of Jay's garage
      for (int i = 0; i < numCars ; i++)
         System.out.println("Car # " + (i+1) +" " + garage[i]);
      
      /*for (Car x : garage)
         System.out.println(x);*/
   
   }//end main
}//end class
