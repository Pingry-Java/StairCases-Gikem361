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
	System.out.println();
    printAscending(size);
    System.out.println();
    printDescending(size);
    System.out.println();
  }

  /**
   * This method prints "X"s in an ascending staircase pattern
   * @param size this is the size of the staircase
   */
  public static int printAscending(int size){
  if (size==0){
  	return 0;
  }
     printAscending(size-1);
   for (int i=0; i<size; i++){
    System.out.print("X ");
    }
System.out.println();
   return size;
  }

  /**
   * This method creates a staircase pattern in a descending order with "X"s
   * @param size this is the size of the descending staircase
   */
  public static int printDescending(int size){
   if (size==0){
   	return 0;
   }
   for(int i=0; i<size; i++){
   	System.out.print("X ");
   	}
    System.out.println();
    printDescending(size-1);
   return size;
  }
}
