import java.util.Scanner;

public class letter {
    public static void main(String[] args) {
        String word;
        char ch = 'd';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        word = sc.next();
        Solution1 so = new Solution1();
        String index = so.reversePrefix(word, ch);
        System.out.println("Index: " + index);
    }
}

class Solution1 {
    public String reversePrefix(String word, char ch) {
        int n = 0 ;
        char h;
        int index = word.indexOf(ch);
        if (index > -1) {
            while( n < word.length()){
                if ( word.charAt(n) == ch) {
                    break;
                }
                else {
                    n++;
                }
            }
            StringBuilder wordbuild= new StringBuilder(word.substring(0, n+1)).reverse();
            wordbuild.append(word.substring(n+1)); 
            String word1 = wordbuild.toString();
            return word1;
        }
        else {
            return word;
        }
        
    }
}