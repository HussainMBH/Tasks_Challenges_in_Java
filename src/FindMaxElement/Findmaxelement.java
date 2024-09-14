package FindMaxElement;

public class Findmaxelement {
    public static void main(String[] args) {
        int a[] = {-4,-3,-2,-1,4,3,2};
        int curVal = 0;
        int maxVal = 0;

        for(int val : a){
            curVal = curVal + val;
            maxVal = Math.max(curVal, maxVal);
        }

        System.out.println(maxVal);
    }
}
