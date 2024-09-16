import java.util.Scanner;
public class sumoffirstfivenaturalnumbers {
    public static void main(String args[]){
        int i,s;        //i have used s for storing the user given value
        Scanner get_input = new Scanner(System.in);
        System.out.println("enter the n natural numbers:");
        s=get_input.nextInt();
        for(i=0;i<=s;i++) {
            System.out.println(i);
        }
        float sum=0;
        for( i=0;i<=s;i++)
            sum+=i;
        System.out.println("Sum:"+sum);

    }

}
