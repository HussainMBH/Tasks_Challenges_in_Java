package DayTry;

public class Day04 {
    public static void main(String[] args) {
        ofcstaff obj = new hrteam();
        ofcstaff objnew = new techteam();
        System.out.println(obj.ofcid());
        System.out.println(obj.empdetails());
        System.out.println(objnew.ofcid());
        System.out.println(objnew.empdetails());

        staff objs = new staff();
        objs.setName("Mohamed");
        objs.setAge(24);
        System.out.println("Name: " + objs.getName());
        System.out.println("Age: " + objs.getAge());
    }
}

class staff{
    private String name;
    private  int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
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
