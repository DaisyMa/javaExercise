import java.util.BitSet;
import java.util.Random;

public class Bits {
    public static void main(String[] args) {
        Random rand=new Random();
        byte bt=(byte)rand.nextInt();
        BitSet bb=new BitSet();
        for(int i=7;i>=0;i--){
            if(((1<<i) & bt)!=0){
                bb.set(i);
            }
            else {
                bb.clear();
            }
        }
        System.out.println("byte value："+bt);
//        printBitSet(bb);
    }
}
