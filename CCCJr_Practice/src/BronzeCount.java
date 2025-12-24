import java.util.Scanner;

public class BronzeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int participants;

        int S;
        int P = 0;

        participants = scanner.nextInt();
        int[] scores = new int[participants];

        for (int i = 0; i < participants; i++) {
            scores[i] = scanner.nextInt();
        }

        int placeholder = 0;
        for (int i = 0; i < participants; i++) {
            for (int j = i + 1; j < participants; j++) {
                if (scores[i] < scores[j]) {
                    placeholder = scores[i];
                    scores[i] = scores[j];
                    scores[j] = placeholder;


                }
            }
        }

        int [] score2 = new int[participants];
        int index = 1;
        for (int i = 0; i < participants -1; i++) {
            score2[i] = scores[i];
                    }
        for (int i = 0; i < participants - 1; i++){
            if (score2[i] != score2[i + 1]) {
                score2[index++] = score2[i + 1];
            }
        }
        S = score2[2];
        for (int i = 0; i < participants; i++){
            if (scores[i] == S){
                P++;
            }
        }

        System.out.println("Third Place: " + S + " " + "Participants: " + P );


    }


}

