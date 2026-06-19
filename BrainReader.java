import java.util.*;
import java.util.Random;
class BrainReader{
    public static void main(String args[])
    {
        System.out.println("*******************************");
        System.out.println("Welcome to brain reader game");
        System.out.println("*******************************");
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int num=r.nextInt(50);
        num*=2;
        System.out.println("Think of a number and press enter");
        sc.nextLine();
        System.out.println("Add the same number of your friend and press enter");
        sc.nextLine();
        System.out.println("Add "+num+" from my side and press enter");
        sc.nextLine();
        System.out.println("Divide by 2 and press enter");
        sc.nextLine();
        System.out.println("Subract the number of your friend and press enter");
        sc.nextLine();
        System.out.println("Now think the number in your brain which is now left now and press enter");
        sc.nextLine();
        System.out.println((num/2)+" is left now.wooohooo,I read your brain");
        sc.nextLine();

    }
}