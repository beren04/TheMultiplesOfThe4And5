package first;

import java.util.Scanner;

public class ikininKatlari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Up to which number do you want to print multiples of 4 and 5?");
        int  number = scan.nextInt();
        for(int i =1;i<=number; i*=4){
            System.out.println(i);
        }
        System.out.print("-------------------------------------");
        for(int i =1;i<=number;i*=5){
            System.out.println(i);
        }
    }
}
