import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ColdCompress {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        LinkedList<String> compressed = new LinkedList<>();
        for (int i = 0; i < N; i++){
            String text = scanner.nextLine();
            int repeated = 0;
            char unique = ' ';
            String toBeAdded = "";
            for(int j = 0; j < text.length(); j++){
                if(j == 0){
                    unique = text.charAt(0);
                }
                if(text.charAt(j) == unique){
                    repeated++;
                }
                else if(text.charAt(j) != unique){
                    String encodedText = " ";
                    encodedText = String.valueOf(repeated) + " " + unique + " ";
                    toBeAdded = toBeAdded + encodedText;
                    unique = text.charAt(j);
                    repeated = 1;
                }
                if (j == text.length() - 1){
                    String encodedText = " ";
                    encodedText = String.valueOf(repeated) + " " + unique + " ";
                    toBeAdded = toBeAdded + encodedText;
                }

            }

            compressed.add(toBeAdded);


        }
        for(String string: compressed){
            System.out.println(string);
        }
    }
}
