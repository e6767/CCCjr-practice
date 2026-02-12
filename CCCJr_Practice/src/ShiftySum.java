import java.util.Scanner;

public class ShiftySum {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Integer k = scanner.nextInt();
        scanner.nextLine();
        int shifting = scanner.nextInt();
        Integer shiftedSum = 0;
        int finalShift = 0;
        int plus = k;
        for(int i = 0; i < shifting; i++){
            String shift = k.toString();
            shift = shift.concat("0");
            shiftedSum = Integer.parseInt(shift);
            finalShift = shiftedSum + plus;
            plus = finalShift;
            k  = shiftedSum;

        }
        System.out.println(finalShift);
    }
}
