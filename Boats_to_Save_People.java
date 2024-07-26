import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Boats_to_Save_People {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int[] people = new int[a];
        for(int i=0; i<a; i++)
        {
            System.out.println("Enter the number");
            people[i] = sc.nextInt();
        }
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        Solution7 s7 = new Solution7();
        int ko = s7.numRescueBoats(people, limit);
        System.out.println(ko);
    }
}
    class Solution7 {
    public int numRescueBoats(int[] people, int limit) {
        int boat=0;
        Arrays.sort(people);
        int heavy = people.length-1;
        int light = 0;

        while(light <= heavy){
            if((people[light] + people[heavy]) <= limit){
                light ++;
                heavy--;
                boat++;
            }
            else{
                heavy--;
                boat++;
            }
        }
        return boat;
    }
}