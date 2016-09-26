/**
 * This programs asks the user for an input, then prints ascending and descending staircases
 * based on the input given by the user
 * @author: Graham Matthews
 * @version: 0.1
 */

import java.util.Scanner;

public class StairCases
{
  /**
   * Main method demonstrates the other wo methods by calling each of them.
   * @param args Standard array of commandline String arguments. Not used in this program.
   */

  public static void main(String[] args)
  {
  	Scanner keyboard = new Scanner(System.in);
  	System.out.println("How many steps would you like?");
    int size = keyboard.nextInt();
    //int size = 4;

    printAscending(size);
    System.out.println();
    printDescending(size);
  }

  /**
   * This method prints "X"s in an ascending staircase pattern
   * @param size this is the size of the staircase
   */
  public static void printAscending(int size){
  System.out.println();
   for (int i=0; i<size; i++){
    for (int j=0; j<=i; j++){
     System.out.print("X ");
    }
    System.out.println();
   }
  }

  /**
   * This method creates a staircase pattern in a descending order with "X"s
   * @param size this is the size of the descending staircase
   */
  public static void printDescending(int size){
   
   for(int i=0; i<size; i++){
    for(int j=i; j<size; j++){
     System.out.print("X ");
    }
    System.out.println();
   }
   System.out.println();
  }
}
