import java.util.Scanner;
public class while_loop {
    public static void main(String args[]){
        System.out.println("Enter any number to add:");
        Scanner get_input= new Scanner(System.in);
        int n=get_input.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){

            System.out.println(i);
            sum+=i;
            i++;

        }


        System.out.println("SUM:"+sum);
    }
}
