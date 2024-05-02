import java.util.Scanner;
public class Largest_Positive_Integer_That_Exists_With_Its_Negative {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in array ");
    int a = sc.nextInt();
    int[] nums = new int[a];
    for(int i=0; i<a; i++)
    {
        System.out.println("Enter the number");
        nums[i] = sc.nextInt();
    }
    Solution2 s2 = new Solution2();
    int ko = s2.findmaxK(nums);
    System.out.println("Answer is " + ko);
  }  
}
class Solution2{
  public int findmaxK(int[] nums){
    int po = -1 ;
    for(int i=0; i < nums.length; i++){
      for(int j=0; j < nums.length; j++){
        if(-nums[i] == nums[j] && nums[i] > po){
          po =nums[i];
        }
      }
    }
    return po;
  }
}