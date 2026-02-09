import java.util.Scanner;

public class CyclicShift {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        String originalT = t;
        boolean containsCyclic = false;
        for(int i = 0; i < t.length(); i++){
            if(i == 0){
                if(t.charAt(i) == s.charAt(i)){
                    if(s.length() - i >= t.length()){
                        if(s.substring(i).equals(t)){
                            containsCyclic = true;
                        }
                    }
                }
            }
            else if(i > 0){
                char finalChar = ' ';
                String newT = "";
                for(int j = 0; j < t.length(); j++) {
                    if (j == 0) {
                        finalChar = t.charAt(j);
                    }
                    if (j == t.length() - 1) {
                        newT = newT + finalChar;
                    } else {
                        newT = newT.concat(String.valueOf(t.charAt(1 + j)));
                    }
                    if(newT.equals(originalT)){
                        break;
                    }
                }
                        for(int p = 0; p < s.length(); p++){
                            if(newT.charAt(0) == s.charAt(p)){
                                if(s.length() - p > t.length()){
                                    if(s.contains(newT)){
                                        containsCyclic = true;
                                    }
                                }
                            }
                        }
                    t = newT;


            }
        }
        if(containsCyclic){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
