import java.util.*;

class Solution {
    public int forLoop(int low, int high) {
        int sum = 0; 
        
        for (int i = low; i <= high; i++) { 
            sum += i;
        }
        return sum;
    }
}

public class basicLoop {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int sum = solution.forLoop(1, 10);
        System.out.println(sum);
    }
}