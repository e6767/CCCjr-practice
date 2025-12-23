import java.util.Scanner;

public class SecretCodes {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int option;
        String cipher;
        System.out.print("Do you want to 1. encrypt or 2. decrypt: ");
        option = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the sentence");
        cipher = scanner.nextLine();
        System.out.println(cipher + option);

        if (option == 1){

        }
        else if (option == 2){

        }
    }
    public static String encryption1 (char [] encryption){


    }
}
