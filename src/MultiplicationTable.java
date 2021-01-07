import java.util.Scanner;


public class MultiplicationTable {
    void printMultiplicationTable(int operand){
        System.out.printf("Multiplication Table of %d can be found below",operand).println();
        for (int i=1;i<=10;i++) {
            System.out.printf("%d * %d = %d", operand, i, (operand * i)).println();
        }
    }
    void printMultiplicationTable(){
        System.out.println("Below is the o/p from the ");

    }
    public static void main(String [] args){
        Scanner valueobject = new Scanner(System.in);
        System.out.print("Enter the value whose multiplication table needs to be printed : ");
        int value=valueobject.nextInt();
        MultiplicationTable object=new MultiplicationTable();
        object.printMultiplicationTable(value);
        object.printMultiplicationTable();
    }
}
