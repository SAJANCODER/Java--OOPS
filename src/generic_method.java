public class generic_method {

    public static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+ " = " + element);
    }
    public static void main(String args[]){
        genericDisplay(11);
        genericDisplay("Hello_SAJAN");
        genericDisplay(1.0);
    }
}

//Generic Method: The type parameter is declared at the method level, making it accessible only within that specific method.