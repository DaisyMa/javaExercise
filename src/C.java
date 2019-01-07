class AA{
    AA(){
        System.out.println("AA init");
    }

    AA(int i){
        System.out.println("AA with arg");
    }
}

class BB{
    BB(){
        System.out.println("BB init");
    }
    BB(int i){
        System.out.println("BB with arg");
    }

}

public class C extends AA {
    C(int i){
        super(i);
        BB b=new BB(8);
    }
    public static void main(String[] args) {
        C c=new C(10);
    }
}
