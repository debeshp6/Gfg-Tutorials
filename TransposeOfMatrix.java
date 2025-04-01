

// User function Template for Java
class Solution {
    public void transpose(int n, int mat[][]) {
        
        // mat[][] is a 2D array here
        // n is the array length
        // let's start!
        
        for(int i=0; i<n; i++) { // first iteration
            for(int j=i+1; j<n; j++) { // second iteration
                int temp = mat[i][j]; // here we are simply swapping the values using a third 'temp' variable
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
