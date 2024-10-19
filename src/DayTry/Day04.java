package DayTry;

public class Day04 {
    public static void main(String[] args) {
        ofcstaff obj = new hrteam();
        ofcstaff objnew = new techteam();
        System.out.println(obj.ofcid());
        System.out.println(obj.empdetails());
        System.out.println(objnew.ofcid());
        System.out.println(objnew.empdetails());
    }
}

abstract class ofcstaff{
    abstract String ofcid();
    public abstract String empdetails();

}

class hrteam extends ofcstaff{
    public hrteam(){
        System.out.println("HRteam Constructor called");
    }

    String ofcid(){
        return "ofc878";
    }
    public String empdetails(){
        return "Employee Name: Bahir, Position: HR Manager";
    }
}

class techteam extends ofcstaff{
    public techteam(){
        System.out.println("Techteam Constructor called");
    }

    String ofcid(){
        return "ofc456";
    }

    public String empdetails(){
        return "Employee Name: Hussain, Position: Tech Lead";
    }
}
