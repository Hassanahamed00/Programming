public class Smartphone extends Buttonphone{

    public Smartphone (String Name,int Number){
        super(Name , Number);
    }

    public void Browse(){
        System.out.println(Name + " Can Browse Internet");
    }
}
