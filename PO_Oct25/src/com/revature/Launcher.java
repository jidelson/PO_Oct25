package com.revature;

public class Launcher {
	
	 int subArraySum(int arr[], int n, int sum)
	    {
	        int curr_sum, i, j;
	 
	        // Pick a starting point
	        for (i = 0; i < n; i++) {
	            curr_sum = arr[i];
	 
	            // try all subarrays starting with 'i'
	            for (j = i + 1; j <= n; j++) {
	                if (curr_sum == sum) {
	                    int p = j - 1;
	                    System.out.println(
	                        "Sum found between indexes " + i
	                        + " and " + p);
	                    return 1;
	                }
	                if (curr_sum > sum || j == n)
	                    break;
	                curr_sum = curr_sum + arr[j];
	            }
	        }
	 
	        System.out.println("No subarray found");
	        return 0;
	    }

	public static void main(String[] args) {
		
		 {
		        Launcher arraysum = new Launcher();
		        int arr[] = {14, 12, 70, 15, 99, 65, 21, 90 };
		        int n = arr.length;
		        int sum = 97;
		        arraysum.subArraySum(arr, n, sum);
		    }

		
	}

}
