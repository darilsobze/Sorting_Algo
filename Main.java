import java.util.Arrays;

public class Main {
    public static void main( String [] args ){
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(selectionSort(new int[]{30, 12, 20, 9, 15})));
        System.out.println(Arrays.toString(insertionSort(new int[]{30, 12, 20, 9, 15})));

    }


    private static int[] selectionSort ( int[] tab){
        for (int i=0; i<tab.length-1 ; i++){
            int iMin = i;
            for (int j=i+1; j<= tab.length-1 ; j++){
                if (tab[j]< tab[iMin])
                    iMin=j; // the number with index j becomes the minimum
            }
            // swap the both numbers with index iMin and i
            int temp= tab[iMin];
            tab[iMin]= tab[i];
            tab[i]= temp;
        }
        return tab;
    }
    private static int[] insertionSort( int[] tab){
        for (int i=1; i<= tab.length-1; i++){
            int key = tab[i];
            int j=i-1;
            while (j>=0 && tab[j] > key){
                tab[j+1] = tab[j];
                j=j-1;
            }
            tab[j+1]= key;
        }
        return tab;
    }
}
