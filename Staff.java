package programtwo;

import java.util.Scanner;

class Staff {
    String StaffID, Name, Phone,Salary;
    Scanner input = new Scanner(System.in);

    void read(){
        System.out.print("Enter Staff ID: ");
        StaffID = input.nextLine();
        System.out.print("Enter Name: ");
        Name = input.nextLine();
        System.out.print("Enter Phone: ");
        Phone = input.nextLine();
        System.out.print("Enter Salary: ");
        Salary = input.nextLine();
    }

    void display(){
        System.out.printf("\n%-15s","STAFFID:");
        System.out.printf("%-15s","StaffID:");
        System.out.printf("%-15s","NAME:");
        System.out.printf("%-15s","Name:");
        System.out.printf("%-15s","PHONE:");
        System.out.printf("%-15s","Phone:");
        System.out.printf("%-15s","SALARY:");
        System.out.printf("%-15s","Salary:");
    }

    class Teaching extends Staff {
        String Domain,Publication;
        void read_Teaching(){
            super.read();
            System.out.print("Enter Domain: ");
            Domain = input.nextLine();
            System.out.print("Enter Publication: ");
            Publication = input.nextLine();
        }
        void display(){
            super.display();
            System.out.printf("%-15s","DOMAIN:");
            System.out.printf("%-15s","Domain:");
            System.out.printf("%-15s","PUBLICATION:");
            System.out.printf("%-15s","Publication:");
        }
    }

    class Technical extends Staff{
        String Skills;
        void read_Technical(){
            super.read();
            System.out.println("Enter Skills: ");
            Skills = input.nextLine();
        }
        void display(){
            super.display();
            System.out.printf("%-15s","SKILLS:");
            System.out.printf("%-15s","Skills:");
        }
    }
  
    class Contract extends Staff{
        String Period;
        void read_Contract(){
            super.read();
            System.out.println("Enter Period: ");
            Period = input.nextLine();
        }
       void display(){
            super.display();
            System.out.printf("%-15s","PERIOD:");
            System.out.printf("%-15s","Period:");
       }
    }
}
