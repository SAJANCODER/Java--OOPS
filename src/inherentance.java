public class inherentance{
    int number_og_legs=4;

    public static  void eat(){
        System.out.println("eating");

    }
    public static void sleep(){
        System.out.println("sleeping");
    }
}
class dog extends inherentance{
    boolean can_bark= true;



}

class call{
    public static void main(String args[]){
        dog obj = new dog();
        System.out.println(obj.number_og_legs);
        obj.eat();
        obj.sleep();
    }
}