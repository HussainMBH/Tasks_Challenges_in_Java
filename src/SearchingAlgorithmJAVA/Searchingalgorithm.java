package SearchingAlgorithmJAVA;

import java.util.Arrays;

public class Searchingalgorithm {
    public static void main(String[] args) {
        int a[] = {8,6,4,7,3,1,2,9,5};
        int tmp = 0;
        int key = 8;
        BinarySearch bs = new BinarySearch();
        bs.binarysearch(a, tmp, key);
    }
}

class BinarySearch{
    void binarysearch(int a[], int tmp, int key){
        for(int i=a.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(a[j]> a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));


        int first = 0;
        int last = a.length-1;
        while (first <last){
            int mid = (first + last)/2;
            if(key == a[mid]){
                System.out.println("Your element "+key+" found at " + mid);
                break;
            } else if (key > mid) {
                first = mid+1;
            }
            else {
                last = mid-1;
            }
        }
    }
}