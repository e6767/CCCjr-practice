import java.util.Scanner;

public class Encryption {
    public static void main (String [] args){
        int option;
        String string;
        String action = "";
        Scanner scanner = new Scanner (System.in);
        System.out.println("What would you like to do. 1 to encrypt, 2 to decrypt: ");
        option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1){
            action = "encrypt";
            System.out.println("What is the sentence you would like to " + action + ": ");
            string = scanner.nextLine();
            System.out.println(string);
        }
        else if (option == 2){
            action = "decrypt";
            System.out.println("What is the sentence you would like to " + action + ": ");
            string = scanner.nextLine();
            System.out.println(string);
        }
        else{
            System.out.println("Not a valid option");
        }

    }

}
