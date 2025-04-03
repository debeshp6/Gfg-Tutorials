

//Back-end complete function Template for Java
class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root, arr); // recursion
        return arr;
    }
    
    
    // preorder traversal: root - left - right
    
    static void helper(Node root, ArrayList<Integer> arr) { // we are creating a helper function here
        if(root == null) return; // base case
        arr.add(root.data);
        helper(root.left, arr); // recursion
        helper(root.right, arr);
        
        // helper function is readyyyy !!!!
    }
}
