import java.util.Scanner;

public class Stack {
    int s[];
    int max,top;

    void a(int n){
        max = n;
        s = new int[max];
        top = -1;
    }

    void push(int ele){
        if(top >= max - 1){
            System.out.println("Stack Overflow");
        }
        else{
            s[++top] = ele;
        }
    }

    void pop(){
        int z;
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        else{
            z = s[top--];
            System.out.println("the popped element is: "+z);
        }
    }

    void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("The stack is: ");
            for(int i = top; i >-1; i--){
                System.out.println(s[i]+"");
            }
        }
    }

    public static void main(String args[]){
        int q=1;
        Stack m = new Stack();
        System.out.println("program to perform stack operations");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the stack");
        int n = sc.nextInt();
        m.a(n);
        while(q!=0){
            System.out.println("1.push 2.pop 3.disolay 4.exit");
            System.out.println("enter your choice");
            int ch = sc.nextInt();
            switch(ch){
                case 1: System.out.println("Enter the element to be pushed");
                        int ele = sc.nextInt();
                        m.push(ele);
                        break;
                case 2: m.pop();
                        break;
                case 3: m.display();
                        break;
                case 4: q=0;
                        break;
                default: System.out.println("wrong choice");
            }
        }
        sc.close();
    }

    
}
