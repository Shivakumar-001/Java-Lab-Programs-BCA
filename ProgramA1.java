/*Program to add two integers and two float numbers.When no arguments are supplied.
Give the default value to calculate the sum.Use function overloading*/
//Function ovreloading is a feature in java that allows a class to have more than one method with same name but different parameter lists.
import java.io.*;
public class ProgramA1
{
    public static void add(int a,int b)
    {
        int sum = a+b;
        System.out.println("The sum of 2 integers is: "+sum);
    }
    public static void add(float c,float d)
    {
        float sum = c+d;
        System.out.println("The sum of 2 float numbers is:"+sum);
    }
    public static void main(String args[])
    {
        int a=10,b=20;
        float c=10.2F,d=20.4F;
        try
        {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            c=Float.parseFloat(args[2]);
            d=Float.parseFloat(args[3]);
        }
        catch(Exception e){}
            System.out.println(a+""+b+""+c+""+d);
            add(a,b);
            add(c,d);
    }
}