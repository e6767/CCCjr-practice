import java.util.Scanner;
public class Trianglane {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int triangles;
        triangles = scanner.nextInt();
        String row1;
        String row2;
        int tapeMeters = 0;
        scanner.nextLine();
        row1 = scanner.nextLine();
        row2 = scanner.nextLine();
        for( int i = 0; i < triangles; i++){
            if(row1.charAt(i) == '1'){
                if(i == 0 &&  row1.charAt(i + 1) == '0'){
                    tapeMeters += 3;
                }
                else if( i == triangles - 1 && row1.charAt(i - 1 ) == '0'){
                    tapeMeters += 3;
                }
                else if((i + 1 < row1.length() && row1.charAt(i + 1) == '0') && (i - 1 > 0 && row1.charAt(i - 1) == '0')){
                    tapeMeters += 3;
                }
                else  if((i + 1 < row1.length() && row1.charAt(i + 1) == '1') || (i - 1 >= 0 && row1.charAt(i - 1) == '1')){
                    tapeMeters += 2;
                }
            }
        }
        System.out.println(tapeMeters);
    }
}
