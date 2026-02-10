import java.util.Scanner;

public class TelemarketerOrNot {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        boolean telemarketer = false;
        boolean telemarketer2 = false;
        int sameNumber = 0;
        boolean numberSame = false;
        for(int i = 0; i < 4; i++){
            int number = scanner.nextInt();
            scanner.nextLine();
            if(i == 0 && (number == 8 || number == 9)){
                telemarketer = true;
            }
            if(i == 1){
                sameNumber = number;
            }
            if(i == 2 && number == sameNumber){
                numberSame = true;
            }
            else if(i == 2 && number != sameNumber){
                telemarketer = false;
            }
            if (i == 3 && (number == 8 || number == 9)){
                if(numberSame){
                    telemarketer2 = true;
                }
            }
        }
        if(telemarketer == true && telemarketer2 == true){
            System.out.println("ignore");
        }
        else{
            System.out.println("answer");
        }
    }
}
