import java.util.Scanner;

public class TroublesomeKeys {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        String pressed = scanner.nextLine();
        String displayed = scanner.nextLine();
        int i = 0;
        int j = 0;
        Character sillyKey = null;
        Character wrongKey = null;
        Character quietKey = null;

        while (i < pressed.length()){
            char p = pressed.charAt(i);
            if (j >= displayed.length()){
                quietKey = p;
                i++;
                break;
            }

            char d = displayed.charAt(j);


            if( p == d){
                i++;
                j++;
            } else {
                if (quietKey != null && p == quietKey) {
                    i++;

                } else if (sillyKey == null) {
                    if (i + 1 < pressed.length() && pressed.charAt(i + 1) == d) {
                        quietKey = p;
                        i++;
                    }
                    else {
                        sillyKey = p;
                        wrongKey = d;
                        i++;
                        j++;
                    }
                } else if (p == sillyKey) {
                    i++;
                    j++;
                }
                else{
                    quietKey = p;
                    i++;
                }
            }


        }
        System.out.println(sillyKey + " " + wrongKey);
        if( quietKey == null){
            System.out.println("-");
        }
        else{
            System.out.println(quietKey);
        }


    }
}
