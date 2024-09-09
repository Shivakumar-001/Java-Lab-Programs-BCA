//Program to catch Negative Array Size Exception .This exception is caused when array is initialized to negative values
import java.io.*;
public class PartB1
{
    public static void main(String args[])
    {
        try
        {
            int arr[]= new int[-5];
            System.out.println("Array initialized");
        }
        catch(NegativeArraySizeException ex)
        {
            System.out.println("Exception occured:NegativeArraySizeException");
        }
    }
}

//OUTPUT : Exception occured:NegativeArraySizeException