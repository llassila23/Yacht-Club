/* Programmer: Lucas Lassila
   Created: 5.25.2023
   Class: CS& 145
   Assignment: Lab 6 Binary Search Tree
   Purpose: This is the Main method, it will call methods defined in Manager.java
 */

import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        Manager tree = new Manager(); // new instance of manager
        tree.Header();
        

        System.out.println("Welcome to The Yacht Club Member Directory");

        int choice = 0;
        do{
        tree.addNode();
        System.out.println("Enter 1 to add a new member, enter 2 to print: ");
        choice = input.nextInt();
        }while(choice == 1);

        // print in order, pre order or post order, chosen within method
        tree.print();
        // print a node, edit it or delete it.
        tree.search();

        input.close();//close scanner
        
    }
    /* create a new instance of Manager
     * 
     * Call User Interface Loops:
     *      New Entry
     *      Edit
     *      Print Options
     *      
     * 
     */
    
}
