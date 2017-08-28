/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */

//import BreezySwing.Format;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class Address_test
{
      public static void main (String[] args)
   {


    //Initialzize Address Objects
    Address home = new Address("456 Elm st", "Naperville", "IL", 60565);
    Address home1 = new Address("23 Maple st", "Naperville", "IL", 60565);
    Address home2 = new Address("12 Grace st", "Naperville", "IL", 60565);
    Address home3 = new Address("4 Stewert st", "Naperville", "IL", 60565);
    Address home4 = new Address("1874Allen st", "Naperville", "IL", 60565);
    Address home5 = new Address("4500Wilson st", "Naperville", "IL", 60565);
    Address home6 = new Address("62 Allen st", "Naperville", "IL", 60565);
    Address home7 = new Address("1111 Elm st", "Naperville", "IL", 60565);
    Address home8 = new Address("8 Grace st", "Naperville", "IL", 60565);
    Address home9 = new Address("005 St. Charles st", "Naperville", "IL", 60565);
    
    //Initialize Task Objects
    Task job1 = new Task(3,"Actually do chores");
    Task job2 = new Task(4,   "Watch Deathnote"); 
    Task job3 = new Task(2.1,   "Help Jacoob build his house");
    Task job4 = new Task(4.5, "Drive Jacoob");
    Task job5 = new Task(1.1,   "Host a party");
    Task job6 = new Task(8.7,    "Go to soccer practice");
    Task job7 = new Task(10000, "Watch the Buffalo Bills");
    Task job8 = new Task(9999.9, "Convert others into Billievers");
    Task job9 = new Task(9999.8, "Enlighten Mr.Hayes about the Bills");
    Task job10 = new Task(3, "Study for anything");


     System.out.println(home.compareTo(home1)); //neg result
     System.out.println(home1.compareTo(home)); //pos result

//Make address list
     Address[] places = {home,home1,home2, home3, home4, home5, home6, home7, home8, home9};
     
     //Diaplsy addresses
        for (Address a:places)
        System.out.println(a.getAdd());

        //Sort and display addresses
        System.out.print("\n\n");
        Sorts.insertionSort(places);
         for (Address a:places)
        System.out.println(a.getAdd());

        //Display tasks
        System.out.print("\n\n\n\n");
        Task[] jobs = {job1,job2,job3,job4,job5,job6,job7,job8,job9};
        for (Task b:jobs)
        System.out.println(b);
        
        //Organize and display tasks
        System.out.print("\n\n");
        Sorts.insertionSort(jobs);
        for (Task b:jobs)
        System.out.println(b);
        
        

}//end of main
}//end of class