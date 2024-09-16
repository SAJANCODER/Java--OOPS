import java.util.Scanner;
public class do_while {
    public static void main(String args[]){
        System.out.println("enter the limit:");
        Scanner get_input=new Scanner(System.in);
        int n =get_input.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
