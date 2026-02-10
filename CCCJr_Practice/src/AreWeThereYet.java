import java.util.Scanner;

public class AreWeThereYet {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer[][] distanceCalculator = new Integer[5][5];
        String distances = scanner.nextLine();
        Integer a = Integer.parseInt(distances.split(" ")[0]);
        Integer b = Integer.parseInt(distances.split(" ")[1]);
        Integer c = Integer.parseInt(distances.split(" ")[2]);
        Integer d = Integer.parseInt(distances.split(" ")[3]);
        distanceCalculator[0] = new Integer[]{0,a,a+b,a+b+c,a+b+c+d};
        distanceCalculator[1] = new Integer[]{a,0,b,b+c,b+c+d};
        distanceCalculator[2] = new Integer[]{a+b,b,0,c,c+d};
        distanceCalculator[3] = new Integer[]{a+b+c,b+c,c,0,d};
        distanceCalculator[4] = new Integer[]{a+b+c+d,b+c+d,c+d,d,0};
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                System.out.print(distanceCalculator[i][j] + " ");
            }
        }

    }
}
