import java.util.Scanner;
public class Compare_Version_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the version ");
        String a = sc.next();
        System.out.println("Enter the next version");
        String b = sc.next();
        Solution5 s5 = new Solution5();
        int g = s5.compareVersion(a, b);
        System.out.println(g);
    }
}
class Solution5 {
    public int compareVersion(String version1, String version2) {
        int n = version1.length(), m = version2.length();
        int i = 0, j = 0;
        while (i < n || j < m) {
            int x = 0;
            for (; i < n && version1.charAt(i) != '.'; ++i) {
                x = x * 10 + version1.charAt(i) - '0';
            }
            ++i; 
            int y = 0;
            for (; j < m && version2.charAt(j) != '.'; ++j) {
                y = y * 10 + version2.charAt(j) - '0';
            }
            ++j;
            if (x != y) {
                return x > y ? 1 : -1;
            }
        }
        return 0;
    }
}