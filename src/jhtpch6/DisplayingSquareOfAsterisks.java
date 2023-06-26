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
public class DisplayingSquareOfAsterisks 
{
   public static void main(String[] args)
   {  
      Scanner input = new Scanner(System.in);

      System.out.println("Enter length of side");
      int side = input.nextInt();

      System.out.println("Enter character");
      char fillCharacter = input.next().charAt(0);
        
//     String fillCharacter = "$";

      squareOfCharacters(side, fillCharacter);
   }
      public static int squareOfCharacters(int n,  char fillCharacter)
      {
        for (int m = 1; m <= n; m++)
        {
        for (int p = 1; p <= n; p++ )
        
          System.out.print( fillCharacter);
          System.out.println();
        } 
      return n;
      }
}
