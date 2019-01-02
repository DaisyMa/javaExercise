public class Leaf {
    private int i=0;
    Leaf increment(){
        i++;
        return this;
    }
    int increment2(){
        i++;
        return i;
    }
    void print(){
        System.out.println("i="+i);
    }

    public static void main(String args[]){
        Leaf x=new Leaf();
        x.increment().increment().print();
        System.out.println(x.increment2());
    }

}
