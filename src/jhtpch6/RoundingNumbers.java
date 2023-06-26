/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jhtpch6;
import java.util.Scanner;
/**
 *
 * @author miltonbennett
 */
public class RoundingNumbers {
   
   private  static double x = 0;
   private  static double y = 0;
   private  static double number = 0;

   public static void main(String args[])
   {
      x = 3.1415926;
      y = Math.floor(x + 0.5);
      System.out.println(y);

      Scanner input = new Scanner(System.in);
   
      while (number != -1)
      {
         double number = input.nextDouble();
         roundToTenths(number);
         roundToHundredths(number);
         roundToThousandths(number);
         System.out.println();
      }
   }

      public static double roundToTenths(double number)
      {
         y = Math.floor(number * 10 + 0.5)/10;
         System.out.println(y); 
      
      return y;
      }

      public static double roundToHundredths(double number)
      {
         y = Math.floor(number * 100 + 0.5)/100;
         System.out.println(y); 
      
      return y;
      }

      public static double roundToThousandths(double number)
      {
         y = Math.floor(number * 1000 + 0.5)/1000;
         System.out.println(y); 
      
      return y;
      }   
}
