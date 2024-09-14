package testtry;

public class tstoop {
    public static void main(String[] args) {
        testchildinherit child = new testchildinherit();
        System.out.println(child.child());
    }

}

class testinherit{
    static String parent(){
        int svmoney = 50000;
        return ("Have save money" + svmoney);
    }
}

class testchildinherit extends testinherit{
    static String child(){
       int childmoney = 25000;
       return parent() + ", and child has money: " + childmoney;
    }
}