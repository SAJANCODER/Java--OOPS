import java.util.Scanner;
public class nested_if {
    public static void main(String args[]){
        Scanner get_input= new Scanner(System.in);
        char status;
        System.out.println("Enter your Status M/F(Married or Unmarried):");
        status = get_input.next().charAt(0);
        if(status=='U' || status=='u'){
            int age;
            char gender;
            System.out.println("Enter Your Gneder M/F(Male or Female):");
            gender=get_input.next().charAt(0);
            System.out.println("Enter Your Age:");
            age=get_input.nextInt();
            if((gender=='m' || gender=='M') && age >30){
                System.out.println("You are eligible for incurence");

            }
            else if((gender=='f' || gender=='F')&& age>25){
                System.out.println("You are eligible for incurence");

            }
            else{
                System.out.println("not eligible for incurence");
            }


        }
        else if(status=='m' || status=='M'){
            System.out.println("You are eligible for incurence");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
