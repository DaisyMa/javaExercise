class Soap{
    private String s;

    Soap(){
        System.out.println("Soap()");
        s=new String("Constructed");
    }

    public String toString(){
        return s;
    }
}


public class Batch {
    private String
     s1=new String("Happy"),
     s2="Happy",
     s3,s4;

    Soap soap;
    int i;
    float toy;

    Batch(){
        System.out.println("Inside Bath()");
        s3=new String("Joy");
        i=47;
        toy=3.14f;
        soap=new Soap();
    }

    void print(){
        if(s4==null)
            s4=new String("Joy");

        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);
        System.out.println("s4="+s4);
        System.out.println("i="+i);
        System.out.println("toy="+toy);
        System.out.println("soap="+soap);
    }

    public static void main(String args[] ) {
        Batch b = new Batch();
        b.print();
    }
}
