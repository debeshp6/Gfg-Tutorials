

class Solution {
    // Function to sort an array using Heap Sort.
    public void heapSort(int arr[]) { // this is the heap sorting function
        // code here
        int n = arr.length;
        
        for(int i=n/2-1; i>=0; i--) {
            heapify(arr, n, i);
        }
        
        for(int i=n-1; i>0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr, i, 0);
        }
    }
    
    public void heapify(int[] arr, int n, int i) { // this is the heapify function, we are making a max heap here
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        
        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        if(largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            
            heapify(arr, n, largest);
        }
    }
}
