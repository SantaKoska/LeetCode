import java.util.Scanner;
public class Remove_Elemet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int[] nums = new int[a];
        for(int i=0; i<a; i++)
        {
            System.out.println("Enter the number");
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter a variable to remove");
        int val = sc.nextInt();
        Solution4 s4 = new Solution4();
        int s42 = s4.removeElement(nums, val);
        
    }
}

class Solution4{
    public int removeElement(int[] nums, int val){
        int j=0;
        for(int i=0; i<nums.length; i++){
            if( nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}