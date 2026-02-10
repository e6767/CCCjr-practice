import java.util.Scanner;

public class OccupyParking {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String parking = scanner.nextLine();
        int sameCar = 0;
        int[]carTracking = new int[n];
        for(int i = 0; i < n; i++){
            if(parking.charAt(i) == 'C'){
                carTracking[i]++;
            }
        }
        String parking2 = scanner.nextLine();
        for (int i = 0; i < n; i++){
            if(parking2.charAt(i) == 'C'){
                carTracking[i]++;
            }
        }
        for(int i = 0; i < n; i++){
            if(carTracking[i] == 2){
                sameCar++;
            }
        }
        System.out.println(sameCar);
    }
}
