// Fig. 6.6: RandomIntegers.java
// Shifted and scaled random integers.
package jhtpch6;

import java.security.SecureRandom; // program uses class Random

public class RandomIntegers
{
   public static void main(String[] args)
   {
      // randomNumbers object will produce secure random numbers
      SecureRandom randomNumbers = new SecureRandom();

      // loop 20 times
      for (int counter = 1; counter <= 20; counter++)
      {
         // pick random integer from 1 to 6
         int face = 1 + randomNumbers.nextInt(6);

         System.out.printf("%d ", face); // display generated value

         // if counter is divisible by 5, start a new line of output
         if (counter % 5 == 0)
         System.out.println();
      }

     for (int counter = 1; counter <= 2; counter++)
      {
         // pick random integer from 1 to 6
         int face = 1 + randomNumbers.nextInt(2);

         System.out.printf("%d ", face); // display generated value

         // if counter is divisible by 5, start a new line of output
         if (counter % 2 == 0)
         System.out.println();
//         System.out.println();
      }

     for (int counter = 1; counter <= 100; counter++)
      {
         // pick random integer from 1 to 6
         int face = 1 + randomNumbers.nextInt(6);

         System.out.printf("%d ", face); // display generated value

         // if counter is divisible by 10, start a new line of output
         if (counter % 10 == 0)
         System.out.println();
      }
 
     for (int counter = 0; counter <= 9; counter++)
      {
         // pick random integer from 0 to 9
         int face = randomNumbers.nextInt(10);

         System.out.printf("%d ", face); // display generated value

         // if counter is divisible by 10, start a new line of output
         if (counter % 10 == 0)
         System.out.println();
      }

   }
} // end class RandomIntegers
