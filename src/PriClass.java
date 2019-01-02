public class PriClass {
    private PriClass(){}

    public static PriClass newPriClass(){
        PriClass priClass=newPriClass();
        priClass.f();
        System.out.println("This is newPriClass");
        return  new PriClass();
    }

//    private static PriClass priClass=new PriClass();
//
//    public static PriClass access(){
//        return priClass;
//    }

    void f(){
        System.out.println("This is the method f of class Priclass.");
    }
}
