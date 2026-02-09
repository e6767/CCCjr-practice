import java.util.Scanner;

public class Art {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        Integer[] xCoordinates = new Integer[N];
        Integer[] yCoordinates = new Integer[N];
        for (int i = 0 ; i < N; i++){
            String coordinates = scanner.nextLine();
            //Integer intCoordinatesX = Integer.parseInt(coordinates.substring(0,2));
            Integer intCoordinatesX = Integer.parseInt(coordinates.split(",")[0]);
            xCoordinates[i] = intCoordinatesX;
            //Integer intCoordinatesY = Integer.parseInt(coordinates.substring(3));
            Integer intCoordinatesY = Integer.parseInt(coordinates.split(",")[1]);
            yCoordinates[i] = intCoordinatesY;

        }
        int lowestX = Integer.MAX_VALUE;
        int lowestY = Integer.MAX_VALUE;
        int highestX = Integer.MIN_VALUE;
        int highestY = Integer.MIN_VALUE;
        for (int i = 0; i < xCoordinates.length; i++){
            lowestX = Math.min(lowestX,xCoordinates[i]);
            lowestY = Math.min(lowestY,yCoordinates[i]);
            highestY = Math.max(highestY,yCoordinates[i]);
            highestX = Math.max(highestX,xCoordinates[i]);
        }
        lowestX -= 1;
        lowestY -= 1;
        highestX += 1;
        highestY += 1;
        /*System.out.print(lowestX);
        System.out.print(',');
        System.out.println(lowestY);
        System.out.print(highestX);
        System.out.print(',');
        System.out.println(highestY); */
        System.out.println(String.valueOf(lowestX) + ',' + String.valueOf(lowestY));
        System.out.println(String.valueOf(highestX) + ',' + String.valueOf(highestY));

        //System.out.println(String.format("%s,%s", lowestX, lowestY));

                    }
}
