public class Landphone {

    String Name;
    int Number;

    public Landphone(String Name, int Number){
        this.Name = Name;
        this.Number = Number;
    }

    public void Call(){
        System.out.println(Name + " can call");
    }
}
