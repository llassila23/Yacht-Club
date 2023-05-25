/* Programmer: Lucas Lassila
   Created: 5.25.2023
   Class: CS& 145
   Assignment: Lab 6 Binary Search Tree
   Purpose: This is the TreeNode Object. It will have a Left and Right pointer and will store the 
   data points of each entry.
 */

public class TreeNode {
    // defining the nodes for the Binary Search Tree
    int SEARCH_KEY; // search key, will be set by ASCII values of Initials and Phone Number

    String FIRST_NAME; // node data
    String LAST_NAME;
    String PHONE_NUM;
    String ADDRESS;
    String CITY;
    String STATE;
    String ZIP;

    TreeNode left; // pointers to child nodes
    TreeNode right; 

    // new node with no children nodes
    public TreeNode( int SEARCH_KEY, String FIRST_NAME, String LAST_NAME, String PHONE_NUM, 
                    String ADDRESS, String CITY, String STATE, String ZIP){

            this.SEARCH_KEY = SEARCH_KEY;

            this.FIRST_NAME = FIRST_NAME;
            this.LAST_NAME = LAST_NAME;
            this.PHONE_NUM = PHONE_NUM;
            this.ADDRESS = ADDRESS;
            this.CITY = CITY; 
            this.STATE = STATE;
            this.ZIP = ZIP;
            
            this.left = null;
            this.right = null; 

    }
    // new node with children nodes
    public TreeNode( int SEARCH_KEY, String FIRST_NAME, String LAST_NAME, String PHONE_NUM, 
                    String ADDRESS, String CITY, String STATE, String ZIP, TreeNode left, TreeNode right){

            this.SEARCH_KEY = SEARCH_KEY;

            this.FIRST_NAME = FIRST_NAME;
            this.LAST_NAME = LAST_NAME;
            this.PHONE_NUM = PHONE_NUM;
            this.ADDRESS = ADDRESS;
            this.CITY = CITY; 
            this.STATE = STATE;
            this.ZIP = ZIP;

            this.left = left;
            this.right = right; 

}
    



    
}
