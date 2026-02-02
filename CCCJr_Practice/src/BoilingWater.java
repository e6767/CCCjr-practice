import java.util.Scanner;

public class BoilingWater {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int b = scanner.nextInt();
        int p = (5 * b) - 400;

        System.out.println(p);
        if(p < 100){
            System.out.println(1);
        }
        else if(p > 100){
            System.out.println(-1);
        }
        else if(p == 100){
            System.out.println(0);
        }

    }
}
