package Allinone;
class Phone {
    void call() {
        System.out.println("Calling");
    }
}

class SmartPhone extends Phone {
    void useInternet() {
        System.out.println("Using Internet");
    }
}

public class Smart {
    public static void main(String[] args) {
        
        Phone p = new SmartPhone();
        p.call(); 

       
        SmartPhone sp = (SmartPhone) p;
        sp.useInternet(); 
}
}