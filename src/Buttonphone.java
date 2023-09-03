public class Buttonphone extends Landphone {

    public Buttonphone(String Name, int Number) {
        super(Name, Number);
    }

    public void sms() {
        System.out.println(Name + " can send sms");

    }
}