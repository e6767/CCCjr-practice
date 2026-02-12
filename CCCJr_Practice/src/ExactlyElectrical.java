import java.util.Scanner;

public class ExactlyElectrical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String startingPos = scanner.nextLine();
        String endingPos = scanner.nextLine();
        int[] startingCords = {Integer.parseInt(startingPos.split(" ")[0]), Integer.parseInt(startingPos.split(" ")[1])};
        int[] endingCords = {Integer.parseInt(endingPos.split(" ")[0]), Integer.parseInt(endingPos.split(" ")[1])};
        int battery = scanner.nextInt();
        int steps = 0;
        if (startingCords[0] - endingCords[0] > 0) {
            steps += (startingCords[0] - endingCords[0]);
        } else if (startingCords[0] - endingCords[0] < 0) {
            steps += (startingCords[0] - endingCords[0]) * -1;
        }
        if (startingCords[1] - endingCords[1] > 0) {
            steps += (startingCords[1] - endingCords[1]);
        } else if (startingCords[1] - endingCords[1] < 0) {
            steps += (startingCords[1] - endingCords[1]) * -1;
        }
        if (battery > steps) {
            if (battery % steps == 0) {
                System.out.println("Y");
            } else if (battery % steps != 0) {
                System.out.println("N");
            }
        }
        if (steps > battery) {
            if (steps % battery == 0) {
                System.out.println("Y");
            } else if (steps % battery != 0) {
                System.out.println("N");
            }
        }
    }


}

