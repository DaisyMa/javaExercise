import java.util.*;

interface CanFight {

    void fight();
    static void testInterface(){
        System.out.println("testInterface");
    }
}

    interface CanSwim {
        void Swim();

        int s = 0;
    }

    interface CanFly {
        void Fly();
    }

    abstract class ActionCharacter {
        int a = 1;

        public void fight() {
        }

        void testMethod(){
            System.out.println("test abstract class");
        }
    }

    class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

        public void Swim() {
        }

        public void Fly() {
        }

    }

    public class Adventure {
        static void t(CanFight x) {
            x.fight();
        }

        static void u(CanSwim x) {
            x.Swim();
//        System.out.println(x.i);   //不能使用接口中声明的成员变量

        }

        static void v(CanFly x) {
            x.Fly();
        }

        static void w(ActionCharacter x) {
            x.fight();
            System.out.println(x.a);   //可以使用抽象类中的成员变量
        }

        public static void main(String[] args) {
            Hero i = new Hero();
            i.testMethod();
//            i.testInterface();
            t(i);
            u(i);
            v(i);
            w(i);
        }
    }

