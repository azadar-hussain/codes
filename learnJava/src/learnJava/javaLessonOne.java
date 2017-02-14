/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnJava;

/**
 *
 * @author azadar
 */

import java.util.Scanner;

public class javaLessonOne {
    
   public static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args){
    
        System.out.print("Enter you favourite number ");
        
        if(userInput.hasNextInt()){
            int EnteredNumber = userInput.nextInt();
        System.out.print("You have entered " + EnteredNumber);
        }else if(userInput.hasNextFloat()){
        System.out.println("you have entered a float number please enter and Integer number again");
        }else{
        System.out.println("you have entered String please enter an Integer number again");
        }
    
    }
    
}
