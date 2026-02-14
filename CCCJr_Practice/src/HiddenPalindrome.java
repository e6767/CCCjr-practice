import java.util.Scanner;

public class HiddenPalindrome {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int palindromeLength = 0;
        for(int i = 0; i < word.length(); i++){
            for(int j = 1; j < word.length(); j++){
                if(j > i) {
                    if (word.substring(i, j).equals(flip(word.substring(i, j)))) {
                        palindromeLength = Math.max(palindromeLength, word.substring(i, j).length());
                    }
                }
                if(j + 1 == word.length()){
                    if (word.substring(i).equals(flip(word.substring(i)))) {
                        palindromeLength = Math.max(palindromeLength, word.substring(i).length());
                    }
                }
            }
        }
        System.out.println(palindromeLength);



    }
    public static String flip (String word){
        String palindrome = "";
        int length = word.length();
        for(int i = 1; i < word.length() + 1; i++){
            palindrome = palindrome + word.charAt(length - i);
        }
        return palindrome;
    }
}
