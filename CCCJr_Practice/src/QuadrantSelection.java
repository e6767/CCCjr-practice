import java.util.Scanner;

public class QuadrantSelection {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int quadrant = 0;
        int xCords = scanner.nextInt();
        scanner.nextLine();
        int yCords = scanner.nextInt();
        if (xCords > 0 && yCords > 0){
            quadrant = 1;
        }
        else if(xCords < 0 && yCords > 0){
            quadrant = 2;
        }
        else if(xCords <0 && yCords < 0){
            quadrant = 3;
        }
        else if(xCords > 0 && yCords < 0){
            quadrant = 4;
        }
        System.out.println(quadrant);
    }
}
