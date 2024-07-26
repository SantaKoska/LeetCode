import java.util.*;
public class Two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array declaration 
        System.out.println("Enter the array");
        int k = sc.nextInt();
        int[] nums = new int[k];
        
        //receving the data in array 
        System.out.println("enter the number in the array");
        for(int i=0; i<k; i++){
            nums[i] = sc.nextInt();
        }

        //taking the target number froim user
        System.out.println("ENTER THE TARGET NUMBER");
        int target = sc.nextInt();

        //solution class calling 
        Solution91 s91 = new Solution91();
        int[] result = s91.twoSum(nums, target);
        
        //display the indices
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}

class Solution91 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]+nums[i] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
