import java.util.Scanner;
public class multiplication_tables {
    public static void main(String args[]){
        System.out.println("ENter the table:");
        Scanner get_input= new Scanner(System.in);
        int t = get_input.nextInt();
        System.out.println("Enter the table limit:");
        int l=get_input.nextInt();
        for(int i=0 ; i<=l ; i++){
            System.out.println(i+ " x " +t +" = " +(i*t) );
        }
    }
}
