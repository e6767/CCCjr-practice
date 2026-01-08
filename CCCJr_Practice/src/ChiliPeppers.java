import java.util.Scanner;

public class ChiliPeppers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        int Chili = 0;
        i = scanner.nextInt();
        int j = 0;

        while (j < i){
            String pepper = scanner.next();
            if("Poblano".equals(pepper) ){
                Chili += 1500;
                j++;

            }else if("Mirasol".equals(pepper)){
                Chili += 6000;
                j++;
            }else if("Serrano".equals(pepper)){
                Chili += 15500;
                j++;
            }else if("Cayenne".equals(pepper)){
                Chili += 40000;
                j++;
            }else if( "Thai".equals(pepper)){
                Chili += 75000;
                j++;
            }else if( "Habanero".equals(pepper)){
                Chili += 125000;
                j++;
            }

        }
        System.out.println(Chili);
    }
}
