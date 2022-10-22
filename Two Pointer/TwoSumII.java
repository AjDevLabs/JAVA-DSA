/**
 * 167. Two Sum II - Input Array Is Sorted
 * @link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */

 import java.util.*;


 /**
  * Find Sum of Two Numbers in a Sorted Array.
  * @author : Amarjeet Kumar
  */
 public class TwoSumII{


    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int[] answer = twoSum(numbers, 9);
        System.out.println(Arrays.toString(answer));
    }

    /**
     * gives the position of two number whoose sum equals to the target number
     * @param : Array of numbers in sorted array.
     * @param : integer 
     * @return : integer array 
     */
    public static int[] twoSum(int[] numbers, int target) {
        int leftEnd = 0;
        int rightEnd = numbers.length-1;
        
        while(leftEnd<rightEnd){
            int sum = numbers[leftEnd]+numbers[rightEnd];
            
            if(sum==target){
                return new int[]{leftEnd+1, rightEnd+1};
            }else if(sum>target){
                rightEnd--;
            }else{
                leftEnd++;
            }
        }
        
        return new int[]{};
    }
 }