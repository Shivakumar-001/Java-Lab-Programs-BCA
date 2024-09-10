//2 nd Java program  to perform mathematical operation
import java.io.*;
class AddSub
{
    int num1=25,num2=5;
    public void add()
    {
        System.out.println("Addition result="+(num1+num2));
    }
    public void subtract()
    {
        System.out.println("Subtraction result="+(num1-num2));
    }
}
class MulDiv extends AddSub
{
    public  void multiply()
    {
        System.out.println("Multiplication result="+(num1*num2));
    }
    public  void divide()
    {
        System.out.println("Division result="+(num1/num2));
    }
    public static void main(String args[])
    {
        MulDiv obj = new MulDiv();
        System.out.println("***Performing Mathematical Operations");
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}

/* OUTPUT

***Performing Mathematical Operations
Addition result=30
Subtraction result=20
Multiplication result=125
Division result=5

 */