class Box<T>{
    private T element;

    public Box(T element){
        this.element=element;
    }
    public T get_element(){
        return element;
    }

    public boolean equals(Box<T> otherBox){
        return this.element.equals(otherBox.get_element());
    }

//   public String toSting(){
//       return "Box contains" + element;
//    }
}
public class using_equal_in_generic_func {
    public static void main(String args[]){
        Box<Integer> int_type =new Box<Integer>(123);
        Box<Integer> int_t_2=new Box<Integer>(123);
        Box<String> str_t_1=new Box<String>("Sajan");
        Box<String>  str_t_2=new Box<String>("Sajan");
        System.out.println("Are the interBox1 and box 2 are equal?"+int_type.equals(int_t_2));
        System.out.println("Are the strign 1 and string 2 are equal?"+str_t_1.equals(str_t_2));



    }

}
