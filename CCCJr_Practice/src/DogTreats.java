import java.util.Scanner;

public class DogTreats {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int smallTreats = scanner.nextInt();
        scanner.nextLine();
        int mediumTreats = scanner.nextInt();
        scanner.nextLine();
        int largeTreats = scanner.nextInt();

        int happyScore = smallTreats + mediumTreats * 2 + largeTreats * 3;
        if (happyScore >= 10){
            System.out.println("happy");
        }
        else if (happyScore < 10){
            System.out.println("sad");
        }
    }
}
