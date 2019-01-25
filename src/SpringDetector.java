import javax.annotation.PreDestroy;
import java.util.*;

class Groundhog{
    int ghNumber;
    Groundhog(int n){
        ghNumber=n;
    }
}

class Groundhog2{
    int ghNum;
    Groundhog2(int n){
        ghNum=n;
    }
    public int hashCode(){
        return ghNum;
    }

    public boolean equals(Object o){
        return (o instanceof Groundhog2) && (ghNum==(((Groundhog2)o).ghNum));
    }
}
class Prediction{
    boolean shadow=Math.random()>0.5;
    public String toString(){
        if(shadow){
            return "six more weeks";
        }
        else{
            return "Early Spring";
        }
    }
}

public class SpringDetector {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        for(int i=0;i<10;i++){
            ht.put(new Groundhog2(i),new Prediction());
        }
        System.out.println("ht="+ht+"\n");
        System.out.println(
                "Looking up prediction for groundho #3"
        );
        Groundhog2 gh=new Groundhog2(3);
        if(ht.containsKey(gh)){
            System.out.println((Prediction)ht.get(gh));
        }
    }
}
