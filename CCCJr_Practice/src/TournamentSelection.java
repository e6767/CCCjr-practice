import java.util.Objects;
import java.util.Scanner;

public class TournamentSelection {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int group = 0;
        for(int i = 0; i < 6; i++){
            String result = scanner.nextLine();
            if(Objects.equals(result, "W")){
                group++;
            }
        }
        if( group == 0){
            System.out.println(-1);
        }
        else if (group == 1 || group == 2){
            System.out.println(3);
        }
        else if (group == 3 || group == 4){
            System.out.println(2);
        }
        else if(group == 5 || group == 6){
            System.out.println(1);
        }
    }
}
