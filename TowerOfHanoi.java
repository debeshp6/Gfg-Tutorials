// User function Template for Java

class Solution {

    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
        
        if(n == 0) return 0;
        
        int move1 = towerOfHanoi(n-1, from, aux, to); // recursive call 1
        int move2 = 1;
        int move3 = towerOfHanoi(n-1, aux, to, from); // recursive call 2
        
        return move1 + move2 + move3; // returning the total number of movements
    }
}
