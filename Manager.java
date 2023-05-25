/* Programmer: Lucas Lassila
   Created: 5.25.2023
   Class: CS& 145
   Assignment: Lab 6 Binary Search Tree
   Purpose: This is the Manager class. It will define the primary methods using the TreeNode Object
 */


import java.util.Scanner;


public class Manager {
    

    private int key; // search key integer

    private String fName = null; // local data per node
    private String lName = null;
    private String phoneNum = null;
    private String address = null;
    private String city = null;
    private String state = null;
    private String zip = null;


    //Manager(); // call constructor

    TreeNode root = new TreeNode(key, lName, fName, phoneNum, address, city, state, zip, null, null);  // create root node



// method definitions begin here
    public void Manager(){ // constructor
    fName = "Yacht";
    lName = "Club";
    phoneNum = "406123CLUB";
    
    key = genKey(fName,lName,phoneNum); // generate key

    address = "Harbor Way";
    city = "Bellingham";
    state = "WA";
    zip = "12345";

       
    }// end manager

    //precondtion: fName, lName and phoneNum have been set
    public int genKey(String fName, String lName, String phoneNum){
        char fN = fName.charAt(0);
        char lN = lName.charAt(0);
        char num8 = phoneNum.charAt(7);
        char num9 = phoneNum.charAt(8);
        char num10 = phoneNum.charAt(9);

        key = (fN-0) + (lN-0) + (num8 -0) + (num9 - 0) + (num10 - 0);
        System.out.println(key);
        return key;
        // reset key to zero after it is used to make a new node

    } // end genKey

    public void add(){
        //getData()
        // genKey()
        if(key < root.SEARCH_KEY){
            root.left = new TreeNode(key, lName, fName, phoneNum, address, city, state, zip, root, root);
            


        }
    }
    // methods defined here:

    /* create an instance of the TreeNode Object
     * run a constructor to start a new TreeNode (maybe a "Administator" person for first entry)
     * Series of strings for data entry
     * Take data from user
     * Compute a Key using the ASCII vals of First and Last Initial + last 4 of Phone num
     * Make a new node with this data and key
     *      Traverse tree method
     *      add method
     * Search and edit function: 
     *      traverse, print, edit a component of the node
     * delete function
     * print:
     *      by key in ascending order, 
     *      by subtrees left to right (pre order)
     *      left to right (in order)
     *      left right root (post order)
     * 
     *      
     *      
     * 
     * 
     *
     * 
     */
    
}
