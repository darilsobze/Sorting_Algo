public class SelectionSorting {
   public static int[] selectionSort(int[] tab){
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
}
