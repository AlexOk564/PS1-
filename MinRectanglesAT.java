package cosc2436.minrectanglesat;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class MinRectanglesAT {
    
    public static void main(String[] args) {
        //Random number generator
        Random rand = new Random();
        int upperbound = 2;
        
        //Get user input for rows and columns
        int userRow;
        int userCol;
        Scanner myObj = new Scanner(System.in);
        
        //Get user input for rows with validation
        System.out.println("How many rows?(Max size 2): ");
        userRow = myObj.nextInt();
        while(userRow <= 0 || userRow > 2){
            System.out.println("That number is invalid.");
            System.out.print("Enter either 1 or 2: ");
            userRow = myObj.nextInt();
        }
        
        //Get user input for columns with validation
        System.out.println("How many columns?(Max size 8): ");
        userCol = myObj.nextInt();
        
        while(userCol <= 0 || userCol > 8){
            System.out.println("That number is invalid.");
            System.out.print("Enter a number between 1 and 8: ");
            userCol = myObj.nextInt();
        }
        //create 2D array according to user input and fill with random 0 or 1
        int[][] arr = new int[userRow][userCol];
        
        for(int i = 0; i < userRow; i++){
            for(int j = 0; j < userCol; j++){
                arr[i][j] = rand.nextInt(upperbound);
            }  
        }
        
        //Print 2D array
         for(int k = 0; k < userRow; k++){
            for(int l = 0; l < userCol; l++){
                System.out.print(arr[k][l]+ " ");
            }  
            System.out.println();
        }
         
        Search groupCounter = new Search();
        int counter = groupCounter.groupCount(arr);
        
        System.out.println(counter);
        
    }
   
}
