/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jhtpch6;

/**
 *
 * @author miltonbennett
 */
import java.util.Scanner;

public class Multiples 
{
   private static int x;
   private static int y;

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
          System.out.println("Enter first integer");
          int  x = input.nextInt();

          System.out.println("Enter second integer");
          int  y = input.nextInt();

          isMultiple(x, y);
   }
      public static int isMultiple(int x, int y)
      {
         int test = y%x;
         if (test == 0)
              System.out.println( true );
         else 
              System.out.println( false);
         return test;
      }
}
