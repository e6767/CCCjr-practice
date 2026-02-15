import java.util.HashMap;
import java.util.Scanner;

public class ArrangingBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookShelf = scanner.nextLine();
        int lPlace = 0;
        int mPlace = 0;
        int sPlace = 0;
        boolean hasL = false;
        boolean hasM = false;
        boolean hasS = false;
        int swap = 0;
        char []bookArrangement = bookShelf.toCharArray();
        for(int i = 0; i < bookShelf.length(); i++){
            if(bookArrangement[i] == 'L'){
                lPlace = i;
                hasL = true;
            }
            else if(bookArrangement[i] == 'M'){
                mPlace = i;
                hasM = true;
            }
            else if(bookArrangement[i] == 'S'){
                sPlace = i;
                hasS = true;
            }
            if(hasM && hasL && hasS) {
                if (hasS && hasL) {
                    if (sPlace < lPlace) {
                        char place = bookArrangement[lPlace];
                        bookArrangement[lPlace] = bookArrangement[sPlace];
                        bookArrangement[sPlace] = place;
                        int pos = lPlace;
                        lPlace = sPlace;
                        sPlace = pos;
                        swap++;
                    }
                }
                if (hasS && hasM) {
                    if (sPlace < mPlace) {
                        char place = bookArrangement[mPlace];
                        bookArrangement[mPlace] = bookArrangement[sPlace];
                        bookArrangement[sPlace] = place;
                        int pos = mPlace;
                        mPlace = sPlace;
                        sPlace = pos;
                        swap++;
                    }
                }
                if (hasM && hasL) {
                    if (mPlace < lPlace) {
                        char place = bookArrangement[mPlace];
                        bookArrangement[mPlace] = bookArrangement[lPlace];
                        bookArrangement[lPlace] = place;
                        swap++;
                        int pos = lPlace;
                        lPlace = mPlace;
                        mPlace = pos;
                    }
                }
            }

        }
        System.out.println(swap);
    }
}
