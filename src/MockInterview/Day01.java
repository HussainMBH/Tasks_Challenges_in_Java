package MockInterview;

public class Day01 {
    public static final int a = 10;
    static final public int b = 20;

    private final int c = 25;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        Y obj = new Y();
        int d = obj.m1();
        System.out.println(d);
    }
}

class X{
     int m1(){
        return 30;
    }
}

class Y extends X{
    public int m1(){
        return 40;
    }
}
