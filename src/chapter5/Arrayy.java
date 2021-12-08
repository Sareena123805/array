package chapter5;
import java.util.Scanner;
public class Arrayy {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]arr;
        arr=new int[5];
        int i;
        for(i=0; i<arr.length;i++){
            System.out.println("Enter an element for index"+ i + ":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are");
        for( i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
