package DSASortings;

import java.util.Arrays;

public class SortingDSA {
    public static void main(String[] args) {
        int tmp = 0;
        int a[] = {6,8,1,4,9,5,2,3,7};
        SortingDSA sdsa = new SortingDSA();
        sdsa.selectionSorting(a, tmp);
    }

    void selectionSorting(int a[], int tmp){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]> a[j]){
                   tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println("Selection Sorting: " +Arrays.toString(a));
    }
}
