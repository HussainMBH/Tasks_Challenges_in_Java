package DayTry;

public class Day02 {
    public static void main(String[] args){
       samsungco obj = new samsungco();
       obj.android();
       obj.android(5);
    }
}

interface phone{
     void android();
}

class samsungco implements phone{
    public void android(){
        System.out.println("Have Play Store");
        System.out.println("In here have Camera");
        System.out.println("Have net connection");
        System.out.println("Have front camera");
    }

    void android(int a){
        System.out.println("Have Android Store");
        System.out.println("In here have Camera");
        System.out.println("Have net connection");
        System.out.println("Have front camera");
    }
}