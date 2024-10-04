/* program to print employees on the siniority-wise*/
import java.io.*;
import java.util.*;
class employee
{
    String ename;
    Date DOA;
    public employee(String ename,Date DOA)
    {
        this.ename=ename;
        this.DOA = DOA;
    }
    public void display()
    {
        System.out.println("Employee Name:"+ename+" Date of Appointment:"+DOA.getDate()+"/"+DOA.getMonth()+"/"+DOA.getYear());
    }
    public static void main(String args[])throws IOException
    {
        employee obj[] = new employee[5];
        obj[0]=new employee("Arvind",new Date(2023,04,15));
        obj[1]=new employee("Arun",new Date(2025,05,15));
        obj[2]=new employee("Bhavana",new Date(2020,04,30));
        obj[3]=new employee("chetan",new Date(2016,10,07));
        obj[4]=new employee("ldanad",new Date(2021,04,18));
        System.out.println("List of employees");
        for(int i=0;i<obj.length;i++)
        {
                obj[i].display();
        }
        for(int i=0;i<obj.length;i++)
        {
            for(int j=0;j<obj.length;j++)
            {
                if(obj[i].DOA.before(obj[j].DOA))
                {
                    employee t = obj[i];
                    obj[i]= obj[j];
                    obj[j]=t;
                }
            }
        }
        System.out.println("****LIst of employyess in seneority-wise****");
        for(int i=0;i<obj.length;i++)
        {
            obj[i].display();
        }
    }

}

/* OUTPUT
 
List of employees
Employee Name:Arvind Date of Appointment:15/4/2023
Employee Name:Arun Date of Appointment:15/5/2025
Employee Name:Bhavana Date of Appointment:30/4/2020
Employee Name:chetan Date of Appointment:7/10/2016
Employee Name:ldanad Date of Appointment:18/4/2021
****LIst of employyess in seneority-wise****
Employee Name:chetan Date of Appointment:7/10/2016
Employee Name:Bhavana Date of Appointment:30/4/2020
Employee Name:ldanad Date of Appointment:18/4/2021
Employee Name:Arvind Date of Appointment:15/4/2023
Employee Name:Arun Date of Appointment:15/5/2025

 */