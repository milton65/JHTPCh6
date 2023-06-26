/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jhtpch6;

import java.util.Scanner;

public class ParkingCharges 
{
   private static double totalCharge = 0;
   private static double hours = 0;

   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);

        while ( hours != -1)
        {
         System.out.print("Enter number of hours: ");
         double hours = input.nextDouble();
         calculateCharges(hours);
        }
        System.out.printf("Total charge for the day is: $%.2f%n", totalCharge);
   }

      public static  double calculateCharges(double hours)
      {
          if (hours == -1)
             {System.out.printf("Total charge for the day is: $%.3f%n", 
              totalCharge);
             }

          else if ( (hours >=0) && (hours <= 3))
           { System.out.printf(
            "%nParking charge for current customer:  $%.2f%n%n", 2.00 );
            System.out.printf( "Total Charge is: $%.2f%n%n", 
                               (totalCharge = totalCharge + 2.00));
           }//return totalCharge;

         else if ( (hours > 3) && (hours <= 16)) 
            {System.out.printf(
            "%nParking charge for current customer:  $%.2f%n%n", 
               ( 2.0 + 0.5 * ( hours - 3)));
            
            System.out.printf( "Total Charge is: $%.2f%n%n",
                  totalCharge = totalCharge + (2.00 + 0.5 * ( hours - 3)));
            }//return totalCharge;

         else if (hours == 24)
            {System.out.printf(
            "%nParking charge for current customer:  $%.2f%n%n", 10.00);
            System.out.printf( "Total charge is: $%.2f%n%n",
                              (totalCharge = totalCharge + 10.00 ));
            }//return totalCharge;

       return totalCharge;
      } 

   
}
