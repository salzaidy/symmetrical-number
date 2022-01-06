

import java.util.Scanner;

class SymmetricalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        
        int num = scanner.nextInt();

        String n = String.valueOf(num);
//        System.out.println(n);

        String first = Character.toString(n.charAt(0));
        String second = Character.toString(n.charAt(1));
        String third = Character.toString(n.charAt(2));
        String fourth = Character.toString(n.charAt(3));

        String res = fourth + third + second + first;

        int f = Integer.parseInt(res);
        if (num == f) {
            System.out.println(1);
        } else
            System.out.println(37);
        //System.out.println(f);
    }
}
