import java.util.Scanner;

public class FergusonballRatings {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int players;
        int points;
        int fouls;
        int stars = 0;

        players = scanner.nextInt();
        int i = 0;
        while (i < players){
            int score = 0;
            points = scanner.nextInt();
            fouls = scanner.nextInt();
            score = (points * 5) - (fouls * 3);
            if ( score > 40){
                stars++;
                i++;
            }else{
                i++;
            }

        }
        if(stars == players){
            System.out.println(stars + "+");
        }else{
            System.out.println(stars);
        }

    }
}


