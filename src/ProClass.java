public class ProClass {

    protected ProClass(){
        System.out.println("protect gouzao");
    }

    public ProClass getProClass(){
        ProClass proClass=new ProClass();
        return proClass;
    }

}
