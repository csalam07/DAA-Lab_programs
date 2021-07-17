package programtwo;


import java.util.Scanner;


class P2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of staff details to be created");
        int n = input.nextInt();
        Staff.Teaching steach[] = new Staff.Teaching[n];
        Staff.Technical stech[] = new Staff.Technical[n];
        Staff.Contract scon[] = new Staff.Contract[n];

        for(int i = 0; i < n; i++) {
            System.out.println("enter teaching staff information");
            steach[i].new Teaching();
            steach[i].read_Teaching();
        }

        for(int i = 0; i < n; i++) {
            System.out.println("enter technical staff information");
            stech[i].new Technical();
            stech[i].read_Technical();
        }

        for(int i = 0; i < n; i++) {
            System.out.println("enter contract staff information");
            scon[i].new Contract();
            scon[i].read_Contract();
        }

        System.out.println("\n STAFF DETAILS: \n");
        System.out.println("-----TEACHING STAFF DETAILS-----");
        for(int i = 0; i < n; i++) {
            steach[i].display();
        }
        System.out.println();
        System.out.println("-----TECHNICAL STAFF DETAILS-----");
        for (int i = 0; i < n; i++) {
            stech[i].display();
        }
        System.out.println();
        System.out.println("-----COntract STAFF DETAILS-----");
        for (int i = 0; i < n; i++) {
            scon[i].display();
        }
        input.close();
    }
    
}
