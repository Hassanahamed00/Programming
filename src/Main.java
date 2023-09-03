public class Main {
    public static void main(String[] args) {

        Landphone phone1 = new Landphone("panasonic",0115476345);
        phone1.Call();
        System.out.println("");

        Buttonphone phone2 = new Buttonphone("nokia",788000604);
        phone2.Call();
        phone2.sms();
        System.out.println("");

        Smartphone phone3 = new Smartphone("Samsung",758000604);
        phone3.Call();
        phone3.sms();
        phone3.Browse();
    }

}