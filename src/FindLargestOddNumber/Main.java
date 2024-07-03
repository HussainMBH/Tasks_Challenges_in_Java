package FindLargestOddNumber;

public class Main {
    public static void main(String[] args) {
        String num = "58862";
        OddlargestNumber ol = new OddlargestNumber();
        String answer = ol.oddnumber(num);
        System.out.println(answer);

        int min = Integer.MAX_VALUE;
        System.out.println(min);
        int max = Integer.MIN_VALUE;
        System.out.println(max);
    }
}

class OddlargestNumber{
    String oddnumber(String num){
        for(int i=num.length() - 1; i>=0; i--){
            char tmp = num.charAt(i);
            int c = Character.getNumericValue(tmp);
            if(c%2 == 1){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
