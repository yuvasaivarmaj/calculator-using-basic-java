import java.util.Scanner;

class calculator {

    int a;
    int b;

    public static void main(String[] args) {
        Scanner firstval = new Scanner(System.in);
        System.out.println("please enter first value : ");
        int a = firstval.nextInt();

        Scanner secondval = new Scanner(System.in);
        System.out.println("please enter second value : ");
        int b = secondval.nextInt();
        Scanner op = new Scanner(System.in);
        System.out.println("please select any one operation below here:");
        System.out.println("add");
        System.out.println("sub");
        System.out.println("multi");
        System.out.println("div");
        String operation = op.nextLine();

        int result;
        switch (operation) {

            case "add":
                result = a + b;
                break;
            case "sub":
                result = a - b;
                break;
            case "multi":
                result = a * b;
                break;
            case "div":
                result = a / b;
                break;
            default:
                System.out.print("try providing proper response");
                return;
        }
        System.out.println("Total :" + result);
    }
}




