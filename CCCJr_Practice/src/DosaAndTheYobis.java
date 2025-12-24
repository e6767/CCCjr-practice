import java.util.ArrayList;
import java.util.Scanner;
public class DosaAndTheYobis {
    public static void main (String [] args){
     Scanner scanner = new Scanner (System.in);
        int D;
        D = scanner.nextInt();
        ArrayList<Integer> Yobi = new ArrayList<>();

        while (scanner.hasNext()){
            Yobi.add(scanner.nextInt());
        }
        for (Integer integer : Yobi) {

            if (D > integer) {
                D += integer;

            } else if (integer >= D) {
                break;
            }


        }

        System.out.println(D);
    }
}

/*      5
        3
        2
        9
        20
        22
        14 */
