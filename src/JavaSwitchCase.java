import java.util.Scanner;

public class JavaSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
//            default:
//                System.out.println("default");
//                break;
            case 3:
                System.out.println(3);
                break;
        }
    }
}
