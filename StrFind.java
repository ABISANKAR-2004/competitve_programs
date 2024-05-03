import java.util.Scanner;
public class StrFind {
    static String findNum(String str){
        String str1="";
        for(char ch:str.toCharArray()){
            int c_actor=(int) ch;
            if(c_actor >= 48 && c_actor <= 57){
                for(int i=48;i<=57;i++){
                    if(i == c_actor){
                        char c=(char)c_actor;
                        str1+=c;
                    }
                }
            }

        }
        return str1;
    }
    public static void main(String args[]){
        Scanner nu=new Scanner(System.in);
        System.out.println("Enter the String mixed with characters:");
        String str=nu.nextLine();
        System.out.println(findNum(str));
    }
}
