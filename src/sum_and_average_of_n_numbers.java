import java.util.Scanner;
public class sum_and_average_of_n_numbers {
    public static void main(String args[]){
        System.out.println("Enter the limit:");
        Scanner get_input= new Scanner(System.in);
        int n= get_input.nextInt();
        int i,a;
        int sum=0;
        int avg=0;
        for(i=1;i<=n;i++){
            System.out.println("Enter Number "+i+ " :");
            a=get_input.nextInt();
            sum+=a;
            avg=sum/n;
        }
        System.out.println("The Sum of give number is "+sum);
        System.out.println("The avg of give number "+avg);


    }
}
