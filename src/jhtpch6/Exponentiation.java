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
public class Exponentiation 
{
   private static int base;
   private static int exponent;
   private static int pow;

   public static void main(String[] args)
   {
      System.out.println( 3 * 3 * 3 * 3 );
      
      integerPower(3,4);
   }

      public static int integerPower( int base, int exponent)
      {

//         pow = base * exponent; 
//        System.out.println( pow );
         
         for (  exponent = base; exponent <= base; exponent++)
         {
             base = base * base;
             
             System.out.println(base);
         }
             System.out.println(exponent);
      return exponent;
      }

}
