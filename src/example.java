class saj{
    private String name;

    saj(String name){
        this.name=name;
    }

    public void prog(){
        System.out.println("sajan is programming ");
    }
    public String get_name(){
        return name;
    }
}

class another_boy extends saj{
    public another_boy(String name){
        super(name);
    }
    public void sleep(){
        System.out.println(get_name()+"sleeping");
    }

}
class third_boy extends another_boy{
    public third_boy(String name){
        super(name);
    }
    public void eat(){
        System.out.println(get_name()+"eating");
    }
}
public class example{
    public static void main(String args[]){
        saj obj1 = new saj("sajan");
        another_boy obj2 = new another_boy("sajan");
        third_boy obj3 = new third_boy("sajan");
        obj1.prog();
        obj2.sleep();
        obj3.eat();
    }
}