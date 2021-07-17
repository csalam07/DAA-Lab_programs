import java.util.Scanner;

public class Student {

    String Usn;
    String Name;
    String Branch;
    String Phone;

    void insertRecord(String usn, String name, String branch, String phone) {

        Usn = usn;
        Name = name;
        Branch = branch;
        Phone = phone;
    }

    void displayRecord() {
        System.out.println(Usn+ "\t"+ Name+ "\t"+ Branch+ "\t\t"+ Phone);
    }

    public static void main(String[] args) {
        Student s[] = new Student[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            s[i] = new Student();
        }
        for(int j=0;j<n;j++) {
            System.out.println("Enter the USN:");
            String Usn = sc.next();
            System.out.println("Enter the Name:");
            String Name = sc.next();
            System.out.println("Enter the Branch:");
            String Branch = sc.next();
            System.out.println("Enter the Phoen:");
            String Phone = sc.next();
            s[j].insertRecord(Usn, Name, Branch, Phone);
        }
        System.out.println("USN\t\tName\t\tBranch\t\tPhone");
        for(int k=0;k<n;k++) {
            s[k].displayRecord();
        }
    }
}
