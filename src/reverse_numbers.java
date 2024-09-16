import java.util.Scanner;
public class reverse_numbers {
    public static void main(String args[]){
        System.out.println("enter the number you want to reverse:");
        Scanner get_input= new Scanner(System.in);
        int n= get_input.nextInt();
        int rem,reverse=0;
        while(n!=0){
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;
        }
        System.out.println("reversed number:"+reverse);
    }

}
