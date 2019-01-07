class Gizmo{
    public void spin(){

    }
}

public class FinalArguments {
    void with(final Gizmo g){
        g.spin();
    }

    void without(Gizmo g){
        g=new Gizmo();
        g.spin();
    }
    int g(final int i){
        return i+1;  //可以读取final 自变量
    }
//    void f(final int i){
//        i++;    //不能改变final 自变量的值
//    }
    public static void main(String[] args){
        FinalArguments bf=new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
