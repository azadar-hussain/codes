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
public class basicArethmeticOperators {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        if(userInput.hasNextInt()){
        
            int EnteredNum = userInput.nextInt();
            int num = 11;
            int sub = num - EnteredNum;
            int add = num + EnteredNum;
            int mul = num * EnteredNum;
            int div = num / EnteredNum;
            int remained = num % EnteredNum;
            System.out.println(EnteredNum + " - " + num + " = " + sub );
            System.out.println(EnteredNum + " + " + num + " = " + add );
            System.out.println(EnteredNum + " * " + num + " = " + mul );
            System.out.println(EnteredNum + " / " + num + " = " + div );
            System.out.println(EnteredNum + " % " + num + " = " + remained );
            
        
        }else {
            System.out.print("Enter an integer next time");
        }
        
        
    }
    
}
