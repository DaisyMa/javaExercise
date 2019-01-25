import java.util.Vector;

class Cat{
    private int catNum;
    Cat(int i){
        catNum=i;
    }
    void print(){
        System.out.println("Cat #"+catNum );
    }
}

class Dog{
    private int dogNum;
    Dog(int i){
        dogNum=i;
    }
    void print(){
        System.out.println("Dog # "+dogNum);
    }
}

public class CatsAndDogs {
    public static void main(String[] args) {
        Vector cats=new Vector();
        for(int i=0;i<7;i++){
            cats.addElement(new Cat(i));
        }
        cats.addElement(new Dog(7));
        for (int i=0;i<cats.size();i++){
            ((Cat)cats.elementAt(i)).print(); //在运行期间，试图将Dog 造型成Cat,会得到一个违例。
        }
    }
}
