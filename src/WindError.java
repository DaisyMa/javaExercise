class NoteX{
    public static final int
        MIDDLE_C=0,C_SHARP=1,C_FLAT=2;
}

class InstrumentX{
    public void play(int NoteX){             //将类名作为标识符号使用
        System.out.println("InstrumentX.play");
    }
}

class WindX extends InstrumentX{
    public void play(NoteX n) {
        System.out.println("WindX.play(NoteX n)");
    }
}

public class WindError {

    public static void tune(InstrumentX i){
        i.play(NoteX.MIDDLE_C);
    }
    public static void main(String[] args) {
        WindX flute=new WindX();
        tune(flute);
    }

}
