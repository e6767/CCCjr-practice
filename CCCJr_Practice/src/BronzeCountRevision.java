import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BronzeCountRevision {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] scores = new int[76];
        Set<Integer> uniqueBronze = new HashSet<>();
        for(int i = 0; i < N; i++){
            int score = scanner.nextInt();
            scanner.nextLine();
            scores[score]++;
            uniqueBronze.add(score);
        }
        Integer [] bronze = uniqueBronze.toArray(new Integer[0]);
        Arrays.sort(bronze);
        reverse(bronze);
        System.out.print(bronze[2]);
        System.out.println(" " + scores[bronze[2]]);

    }
    public static int reverse(Integer[] bronze){
        for(int i = 0; i < bronze.length/2; i++){
            int swap = bronze[i];
            bronze[i] = bronze[bronze.length - i - 1];
            bronze[bronze.length - i - 1] = swap;
        }

        return 0;
    }
}
