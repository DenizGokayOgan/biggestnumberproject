import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count,n, bigN, smallN, firstN;

        System.out.println("Please enter how many numbers do you:  ");
        count = input.nextInt();
        System.out.print("Please enter 1. number: ");
        firstN = input.nextInt();
        smallN = firstN;
        bigN = firstN;

        for(int i=2; i<=count; i++){

            System.out.print("Please enter "+ i+". number: ");
            n=input.nextInt();

            if(n>bigN){
                bigN=n;
            }
            if(n<smallN){
                smallN =n;
            }
        }
        System.out.println("The smallest number is "+smallN+".");
        System.out.println("The biggest number is "+bigN+".");
    }
}      