import java.util.Scanner;
import java.util.StringTokenizer;

public class NonVowels{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String vowel = "aeiouAEIOU";
        System.out.println("Please input the phrase: ");
        String str = s.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        
        while (st.hasMoreTokens()) {
            int count = 0;
            String token = st.nextToken();    
            int flag = 0;
            for(int i = 0; i< token.length(); i++){
                for(int j =0 ; j<vowel.length();j++){
                    if(vowel.charAt(j) == token.charAt(i)){
                        count++;
                    }
                }
            }
            
            System.out.println("The no of non-vowels in "+ token+ " is "+ (token.length()-count));
            count = 0;
        }
        
    }
}