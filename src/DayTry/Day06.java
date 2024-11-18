package DayTry;

import java.util.Arrays;

public class Day06 {
    public static void main(String[] args) {
        int a[] = {4,9,7,2,3,1,5,8,6};
        int tmp = 0;

        for(int i=0; i<a.length; i++){
            for(int j= i+1; j<a.length; j++){
                if(a[i]> a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        System.out.println("Selection Sorting: " + Arrays.toString(a));
    }
}
