//3rd java program observe object's member variable values
import java.io.*;
public class PartA3
{
    static int num1;
    public static void main(String args[])
    {
        PartA3 obj1 = new PartA3();
        PartA3 obj2 = new PartA3();
        obj1.num1 = 100;
        obj2.num1 = 200;
        System.out.println("***Assigned values");
        System.out.println("obj1.num1=100\t obj2.num1=200\n");
        System.out.println("***Printing values***");
        System.out.println("obj1.num1="+obj1.num1+"\t obj2.num1="+obj2.num1);
    }
}

/* output 

***Assigned values
obj1.num1=100    obj2.num1=200

***Printing values***
obj1.num1=200    obj2.num1=200

 */