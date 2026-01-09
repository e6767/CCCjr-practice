import java.util.Scanner;

public class DeliveEDroid {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int p = 0;
        int j = 0;
        int finalScore;
        p = scanner.nextInt();
        j = scanner.nextInt();

        p = p * 50;
        j = j * 10;
        finalScore = p-j;

        if(p>j){
            finalScore += 500;
            System.out.println(finalScore);
        }else{
            System.out.println(finalScore);
        }

    }
}
