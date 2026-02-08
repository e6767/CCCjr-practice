import java.util.Scanner;

public class Epidemiology {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        scanner.nextLine();
        int patientZero = scanner.nextInt();
        scanner.nextLine();
        int r = scanner.nextInt();
        int totalInfected = patientZero;
        int day = 0;
        while (totalInfected < p){
            day++;
            totalInfected += r;
            r = r * r;
        }
        System.out.println(day);
    }
}
