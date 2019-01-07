class Insect{
    int i=9;
    int j;
    Insect(){
        prt("i="+i+",j="+j);
        j=30;
    }
    static int x1=prt("static Insect.x1 init");

    static int prt(String s){
        System.out.println(s);
        return 47;
    }
}

public class Beetle  extends Insect{
    int k=prt("Beetle.k init");
    Beetle(){
        prt("k="+k);
        prt("j="+j);
    }
    static int x2=prt("static Beetle.x2 init");

    static int prt(String s){
        System.out.println(s);
        return 63;
    }

    public static void main(String[] args) {
        prt("Beetle main");
        Beetle b=new Beetle();
    }
}
