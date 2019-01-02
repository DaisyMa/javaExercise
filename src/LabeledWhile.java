public class LabeledWhile {
    public static  void main(String[] args){
        int i=0;
        outer:
        while (true){
            System.out.println("Outer while loop");
            while (true){
                i++;
                System.out.println("i="+i);
                if(i==1){
                    System.out.println("continue");
                    continue ;
                }
                if(i==3){
                    System.out.println("continue outer");
                    continue outer;
                }
                if(i==5){
                    System.out.println("break");
                    break ;
                }
                if(i==7){
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
        prtInt();
        switchTest();
    }

    static void prtInt(){
        for(int i=1;i<=100;i++){
            System.out.println(i);
            if (i==10){
                return;
            }
        }
    }

    static void switchTest(){
        for(int i=1;i<=4;i++){
            switch (i){
                case 1:
                    System.out.println(i);            //没有break语句，case语句会简单的下移，直到所有case结束
                case 2:
                    System.out.println("b");
                case 3:
                    System.out.println("c");
                case 4:
                    System.out.println("d");
            }
        }
    }


}
