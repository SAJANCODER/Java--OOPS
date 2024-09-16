import java.util.Scanner;
public class grade {
    public static void main(String args[]){
        Scanner get_input= new Scanner(System.in);
        int grade;
        System.out.println("Enter your grade:");
        grade=get_input.nextInt();
        if(grade>=90 && grade<=100){
            System.out.println("Grade A");
        } else if (grade>=80 && grade<=89) {
            System.out.println("Grade B");
            
        } else if (grade>=70 && grade<=79) {
            System.out.println("Grade C");
            
        }
        else if(grade>50 && grade<=70){
            System.out.println("Grade D");
        }
        else{
            System.out.println("fail");
        }
        System.out.println("bye");



    }
}
