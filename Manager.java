/* Programmer: Lucas Lassila
   Created: 5.25.2023
   Class: CS& 145
   Assignment: Lab 6 Binary Search Tree
   Purpose: This is the Manager class. It will define the primary methods using the TreeNode Object
 */

 
//import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Manager {
// note private methods are intended to distinguish them as "Sub methods"
// the following variables are set everytime the user creates a new entry.
    private int key = 0; // search key integer

    private String fName = null; // local data per node
    private String lName = null;
    private String phoneNum = null;
    private String address = null;
    private String city = null;
    private String state = null;
    private String zip = null;

    //ArrayList<Integer>  keySet = new ArrayList<Integer>(); // will contain all keys

    Scanner input = new Scanner(System.in);

    TreeNode root = new TreeNode(key, lName, fName, phoneNum, address, city, state, zip, null, null);  // create local root node with null values


// method definitions begin here
    public void Header(){ // constructor, fill root node
        // initilal values for root node
        fName = "Yacht";
        lName = "Club";
        phoneNum = "123-456-0901";

        key = genKey(); // generate key
        
        address = "Harbor Way";
        city = "Bellingham";
        state = "WA";
        zip = "12345";
        // fill root with values
        root.SEARCH_KEY=key;
        root.FIRST_NAME=fName;
        root.LAST_NAME=lName;
        root.PHONE_NUM=phoneNum;
        root.ADDRESS=address;
        root.CITY=city;
        root.STATE=state;
        root.ZIP=zip;
         
        key = 0; // reset key
       
    }// end manager

    //precondtion: fName, lName and phoneNum have been set -> getData must always be run prior to genKey to ensure a unique key
    public int genKey(){

        Random rand = new Random();
        int randNum = rand.nextInt(50); // random number from 0 to 15 to help seperate key values


        // char val for initials
        char fN = fName.charAt(0);
        char lN = lName.charAt(0);
        // char val for last 3 of phoneNum
        char num8;
        char num9;
        char num10;

        if(phoneNum.length() > 10){ // does not matter what format phoneNum is entered as
            num8 = phoneNum.charAt(9);
            num9 = phoneNum.charAt(10);
            num10 = phoneNum.charAt(11);
        } else if (phoneNum.length() > 7){
            num8 = phoneNum.charAt(7);
            num9 = phoneNum.charAt(8);
            num10 = phoneNum.charAt(9);
        } else {
            num8 = phoneNum.charAt(4);
            num9 = phoneNum.charAt(5);
            num10 = phoneNum.charAt(6);
        }

        key = (fN-0) + (lN-0) + (num8 -0) + (num9 - 0) + (num10 - 0) + randNum; // makes a key for that given entry
        System.out.println(key);

        //keySet.add(key); // add key to keySet
        return key;
        // reset key to zero after it is used to make a new node

    } // end genKey

    // precondition: key = 0 and TreeNode root exists
    // post condition: node has been added
    public void addNode(){
        getData(); // take user input
        key = genKey(); // generate key given user data

        // does not work. current is set to null everytime


        TreeNode current = root; // start at top

        

        if(key < root.SEARCH_KEY){ // if less than root go to left

            if(root.left == null){ // if first node, no need to search, just add to root.
                root.left = new TreeNode(key, lName, fName, phoneNum, address, city, state, zip, null, null);
            }else{
            current = root.left; 
            traverseAndAdd(current);
            }
        }else if(key > root.SEARCH_KEY){ // greater than root go to right
            if(root.right == null){
                root.right = new TreeNode(key, lName, fName, phoneNum, address, city, state, zip, null, null);
            }else{
            current = root.right; 
            traverseAndAdd(current);
            }
        } 
        key = 0; // reset key to be zero
    }

    private void getData() {

        System.out.println("Enter First Name: ");
        fName=input.next();
        System.out.println("Enter Last Name: ");
        lName=input.next();
        System.out.println("Enter Phone Number : ");
        phoneNum=input.next();
        System.out.println("Enter Street: ");
        address=input.next();
        System.out.println("Enter City: ");
        city=input.next();
        System.out.println("Enter State");
        state=input.next();
        System.out.println("Enter ZIP Code: ");
        zip=input.next();


    }

    // precondition: key of new node has been compared to root key and current has been set to the head of the appropriate subtree. 
    //              first nodes after the root have been set already
    // postcondition: new node has been added
    private void traverseAndAdd(TreeNode current) { // called by addNode and traverses through the subtrees and adds a new node 

       // if (current == null){ // case that there is only the root node
        //    current = new TreeNode(key, fName, lName, phoneNum, address, city, state, zip, null, null);
        //} // if done, while loop and if else will not run b.c current.L&R are null & key == current.Search_Key

        // traverse until null space is found
        while(current.left!= null || current.right != null){
            if(key < current.SEARCH_KEY){
                current = current.left; // go to left if smaller
            } else if (key > current.SEARCH_KEY){
                current = current.right; // go to right if bigger
            }
        } // end traversing while loop

        // add new nodes to null "roots" of current
        if(key < current.SEARCH_KEY){ // new node to left of current
            current.left = new TreeNode(key, fName, lName, phoneNum, address, city, state, zip, null, null ); // new node with null "roots"
        } else if ( key > current.SEARCH_KEY){ // new node to right of current
            current.right = new TreeNode(key, fName, lName, phoneNum, address, city, state, zip, null, null);
        } // end add new node if else
    }// end traverseAndAdd

    public void print(){ // method to print tree in different ways
        TreeNode current = root;


        //if(want print in order){}
        // recursive in order traversal
        printInO(current);

        



        


        // every key created goes into an array list
        // can sort this array list for the given traversal types
        // search() will find the node at that key
        // printNode(said node with said key)


    }

    
    private void printInO(TreeNode current){

        try {

            printInO(current.left);
            printNode(current);
            printInO(current.right);

        } catch (Exception NullPointerException) {
            return;
        }


        
    }



    private void printNode(TreeNode current){
        System.out.println();

        System.out.print(current.SEARCH_KEY +"" + " ");
        System.out.print(current.FIRST_NAME + " ");
        System.out.print(current.LAST_NAME + " ");
        System.out.print(current.PHONE_NUM + " ");
        System.out.print(current.ADDRESS + " ");
        System.out.print(current.CITY + " ");
        System.out.print(current.STATE + " ");
        System.out.println(current.ZIP );
        

    }

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
