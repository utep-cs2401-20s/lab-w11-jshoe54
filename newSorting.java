
public class SortingAssignment {
	public static void main(String [] args) {
		
	}
	public static void newSorting(int[] A, int size){
	    if(size <= 0){
	        size = 1;
	    }
	    
	    if(A.length <= size){
	        quickSort(A, 0, A.length - 1);
	    }
	    else{
	        int mid = A.length/2;
	        int[] leftA = new int[mid];
	        int[] rightA = new int[mid]; 
	   for(int i = 0; i < leftA.length; i++) {
	            leftA[i] = A[i];
	   }
	   for(int i = 0; i < rightA.length; i++) {
	            rightA[i] = A[mid++];
	   }
	        newSorting(leftA, size);
	        newSorting(rightA, size);
	        merge(A,leftA,rightA);
	        }
	    }
	public static int split(int array[], int begin, int end) {
	    int pivot = array[end];
	    int i = begin-1;
	    for (int j = begin; j < end; j++) {
	        if (array[j] <= pivot) {
	            i++;
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
	    int temp = array[i+1];
	    array[i+1] = array[end];
	    array[end] = temp;
	    return i+1;
	}
	 static void merge(int[] A, int[] leftA, int[] rightA){
	    int left = 0;
	    int right = 0;
	    for(int i = 0; i < A.length; i++){
	        if(left < leftA.length && right < rightA.length){
	            if(leftA[left] <= rightA[right]){
	                A[i] = leftA[left];
	                left++;
	            }
	            else{
	                A[i] = rightA[right];
	                right++;
	            }
	        }
	        else if(left < leftA.length){
	            A[i] = leftA[left];
	            left++;
	        }
	        else if (right < rightA.length){
	            A[i] = rightA[right];
	            right++;
	        }
	    }
	}
	 	static void quickSort(int array[], int begin, int end) {
	 		if (begin < end) {
	        int partitionIndex = split(array, begin, end);
	        quickSort(array, begin, partitionIndex-1);
	        quickSort(array, partitionIndex+1, end);
	 		}
	 	}
}
