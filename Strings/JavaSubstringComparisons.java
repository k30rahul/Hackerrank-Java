import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        
        String smallest = s.substring(0,k);
        String largest = "";
        
        for(int i=0;i<s.length()-k+1;i++){
            String c=s.substring(i,i+k);
            if(c.compareTo(smallest)<0)
                smallest=c;
            if(c.compareTo(largest) >0) 
            largest = c; 
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
       
    }
     return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
