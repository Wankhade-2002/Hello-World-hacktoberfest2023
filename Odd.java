import java.util.Scanner;
public class dumm {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        for(int i=0; i<=b; i++){
            int result = i * 2 + 1;
            System.out.println("even number form: " + result);
       }
    }
}
