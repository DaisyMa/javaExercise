import java.util.Stack;

public class Stacks {
    static String[] months={
            "Jan","Feb","Mar","Apr",
            "May","June","July","Aug","Sep",
            "Oct","Nov","Dec"
    };

    public static void main(String[] args) {
        Stack stk=new Stack();
        for(int i=0;i<months.length;i++){
            stk.push(months[i]+" ");
        }
        System.out.println("stk="+stk);
        stk.addElement("The last line");
        System.out.println("element 5="+stk.elementAt(5));
        System.out.println("popping elements:");
        while (!stk.empty()){
            System.out.println(stk.pop());
        }

    }
}
