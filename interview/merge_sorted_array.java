        import java.util.Scanner;
        public class merge_sorted_array {
            public static void main(String arg[]) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number of elements in first array");
                int m = sc.nextInt();
                int[]  nums1 = new int[m];
                for(int i=0; i<m; i++)
                {
                    System.out.println("Enter a number");
                    nums1[i] = sc.nextInt();
                }
                System.out.println("Enter the number of elements in second array");
                int n = sc.nextInt();
                int[] nums2 = new int[n];
                for(int i=0; i<n; i++)
                {
                    System.out.println("Enter a number");
                    nums2[i] = sc.nextInt();
                }
                Solution sx = new Solution();
                sx.merge(nums1, m, nums2, n);
            }
        }

        class Solution {
            public void merge(int[] nums1, int m, int[] nums2, int n){
                int a=0, b=0, c=0;
                int[] nums3 = new int[m+n];
                while (a < m) {
                    if(b < n && nums1[b] < nums2[a]){
                        nums3[c++] = nums2[b++];
                    }
                    else {
                        nums3[c++] = nums1[a++];
                    }
                }
                for(int i=0; i<nums3.length; i++){
                    System.out.println(nums3[i] + " ");
                }
            }
        }
                