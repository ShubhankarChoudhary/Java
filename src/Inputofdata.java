import java.util.Scanner;

public class Inputofdata {
    void data(){
        Scanner inputValue=new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int firstValue=inputValue.nextInt();
        System.out.print("Enter the second value : ");
        int secondValue=inputValue.nextInt();
        System.out.println("The enterd value is "+firstValue);
        System.out.println("The enterd value is "+secondValue);
    }
    public static void main(String[] args){
        Inputofdata object = new Inputofdata();
        object.data();
    }
}
