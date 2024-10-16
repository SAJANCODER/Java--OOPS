public class toggle_case {
    //used for converting the first letter of the words to lower and capitizalizing the remaining word to uppercase
    public static void main(String args[]){
        StringBuilder a = new StringBuilder("The SaJan Is A MUltiMIllioner");
        System.out.println("before toggle:"+a);
        if(a.charAt(0)>=65 && a.charAt(0)<=90){
            int c=(int) a.charAt(0)+32;
            a.setCharAt(0,(char)c);
        }
        for (int i=1;i<a.length();i++){
            if(a.charAt(i)==32){
                i++;
                if(a.charAt(i)>=65 && a.charAt(i)<=90){
                    int c= (int) a.charAt(i)+32;
                    a.setCharAt(i,(char)c);
                }
            }
            else{
                if(a.charAt(i)>=97 && a.charAt(i)<=122){
                    int c=(int) a.charAt(i)-32;
                    a.setCharAt(i,(char)c);
                }
            }
        }
        System.out.println("after toggle:"+a);
    }
}
