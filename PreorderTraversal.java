

//Back-end complete function Template for Java
class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root, arr);
        return arr;
    }
    
    static void helper(Node root, ArrayList<Integer> arr) {
        if(root == null) return;
        arr.add(root.data);
        helper(root.left, arr);
        helper(root.right, arr);
    }
}
