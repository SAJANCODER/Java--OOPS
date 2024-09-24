class Test<T,U>{
    T obj1;
    U obj2;
    Test(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;

    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

public class generic_func {
    public static void main(String args[]){
            Test<Integer,String> int_str = new Test<Integer,String>(18,"SAJAN");
            Test<String,Integer> str_int = new Test<String,Integer>("Lam",18);
            Test<String,String> str_str = new Test<String,String>("Hello","SAJAN");
            Test<Integer,Integer> int_int = new Test<Integer,Integer>(18,18);
            int_str.print();
            str_int.print();
            str_str.print();
            int_int.print();


    }
}
//Generic Class: The type parameter is declared at the class level, making it accessible throughout the class.