import java.util.Arrays;
import java.util.Scanner;

public class Relative_Ranks {
 public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int[] score = new int[a];
        for(int i=0; i<a; i++)
        {
            System.out.println("Enter the number");
            score[i] = sc.nextInt();
        }
        Solution09 s09 = new Solution09();
        String[] resuly =s09.findRelativeRanks(score);
        System.out.println(Arrays.toString(resuly));
 }   
}
class Solution09 {
    public String[] findRelativeRanks(int[] score) {
        String[] Rank = new String[score.length];
        int k = 0;
        int[] scoresort = Arrays.copyOf(score, score.length);
        Arrays.sort(scoresort);
        for(int i = scoresort.length-1; i>=0; i--){
            for(int j=0; j<score.length; j++){
                if(scoresort[i] == score[j]){
                    if(i == scoresort.length-1){
                        Rank[j] = "Gold Medal";
                        k++;
                    }
                    else if(i == scoresort.length-2){
                        Rank[j] = "Silver Medal";
                        k++;
                    }
                    else if(i == scoresort.length-3){
                        Rank[j] = "Bronze Medal";
                        k++;
                    }
                    else if(i < scoresort.length-3){
                        k++;
                        Rank[j] = Integer.toString(k);
                    }
                }
            }
        }
        return Rank;
    }
}
