//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        
        int lcmGcd[] = new int[2];
        int gcd = 1, lcm, min, max;
        
        if(a>b) {
            min = b;
            max = a;
        }
        else {
            min = a;
            max = b;
        }
        // GCD
            
        for(int i = 1; i <= min; i++){
            if (a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }
        
        //LCM
        for(int i = max;; i+=max){
            if (i%min == 0) {
                lcm = i;
                break;
            }
        }
        
        lcmGcd[0]=lcm;
        lcmGcd[1]=gcd;
        return lcmGcd;
    }
}


//{ Driver Code Starts.

// } Driver Code Ends