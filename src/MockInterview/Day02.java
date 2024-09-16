package MockInterview;

public class Day02 {
    public static void main(String[] args) {
        Object obj = new int[] {1,2,3};
        if(obj instanceof int[]){
            System.out.println("Array");
        }
        else {
            System.out.println("Not Array");
        }
    }
}
