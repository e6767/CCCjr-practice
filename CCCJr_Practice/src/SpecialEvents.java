import java.util.Scanner;

public class SpecialEvents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people;
        people = scanner.nextInt();
        int i = 0;
        int[] days = new int[5];
        int max = 0;
        int multipleDays = 1;
        while (i < people) {
            String availability = scanner.next();
            for (int j = 0; j < availability.length(); j++) {
                if (availability.charAt(j) == 'Y') {
                    days[j]++;
                }
            }
            i++;
        }


        for (int j = 0; j < days.length; j++) {
            if (max < days[j]) {
                max = days[j];
            }
            else if (days[j] == max){
                multipleDays++;
            }
        }

        boolean notFirstMaxValue = false;
        for (int l = 0; l < days.length; l++) {
                if(days[l] == max){
                    if (notFirstMaxValue){
                        System.out.print(",");
                    }
                    System.out.print(l + 1);
                    notFirstMaxValue = true;

            }
        }
    }
}

