import java.io.*;
import java.util.*;
class FirstYear
{
	public int total;
	public String cname,sname;
	public static int big=0;count=-1;
	FirstYear(String asname,String acname,int atotal) 
	{
		cname=acname;
		sname=asname;
		total=atotal;
	}
	public void BestStudent()
	{
		if(total>big)
		{
			count++;
			big=total;
		}
	}
	public static void main(String args[])throws IOException
	{
		System.out.println("How many Students?");
		Scanner sc=new Scanner(System.in) ;
		int n=sc.nextInt();
		FirstYear Student[]=new FirstYear[n] ;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Class,Name, and TotalMarks?");
			Student[i]=new FirstYear(sc.next(),sc.next(),sc.nextInt())   ;
			Student[i].BestStudent();
		}
		System.out.println("\n *****Student details******");
		System.out.println("StudentName:"+student[count].sname+"\tClass:"+student[count].cname+"\tTotal Marks:"student[count].total);
	}
}
	
		
	