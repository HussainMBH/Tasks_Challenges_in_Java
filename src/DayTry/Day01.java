package DayTry;

public class Day01 {
    public static void main(String[] args) {
        Staff obj;

        obj = new Manager();
        obj.Print();
        obj = new HR();
        obj.Print();
    }
}

class Staff{
    void Print(){
        System.out.println("Parent Section");
    }
}

class HR extends Staff{
    void Print(){
        System.out.println("HR assigned for Supervising all office Properties");
    }
}

class Manager extends Staff{
    void Print(){
        System.out.println("Manager Handling all management sections");
    }
}