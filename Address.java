//********************************************************************
//  Address.java       Author: Lewis/Loftus/Cocking
//
//  Represents a street address.
//********************************************************************

import java.util.Scanner;
public class Address implements Comparable
{

   private String streetAddress, city;
   private static String state;
   private int zipCode;

   //-----------------------------------------------------------------
   //  Sets up this Address object with the specified data.
   //-----------------------------------------------------------------

   public Address(){}

   public Address (String street, String town, String st, int zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }
   public Address (String street, String st, int zip)
   {
      streetAddress = street;
      state = st;
      zipCode = zip;
      city = "Naperville";
   }

   public int compareTo(Object obj)
   {
     //Initialzie variables
       Scanner scan = new Scanner (this.streetAddress);
      Address temp = (Address)obj;
      Scanner scans = new Scanner (temp.streetAddress);
       int cut = 0;
       int letters = 0;
       
       //Loop through until find street name
       while(letters <= this.streetAddress.length()-1){
            
           //Get each character
            char letter = this.streetAddress.charAt(letters);
            
            //Test to see if it is a letter
        if ((letter > 64 && letter < 91)||(letter > 96 && letter <123)){
         cut = letters;
         
         //End loop
        letters = 100;}
         
        //Go to the next character
         letters+=1;
    }
    
    //Get the number and the street name separately
    String add3 = this.streetAddress.substring(0,cut);
    String add1 = this.streetAddress.substring(cut);
    
    //Reset
    letters = 0;
     
    //Loop through until find street name
    while(letters <= temp.streetAddress.length()-1){
               
        //Get each character
            char letter = temp.streetAddress.charAt(letters);
            
            //Test to see if it is a letter
        if ((letter > 64 && letter < 91)||(letter > 96 && letter <123)){
         cut = letters;
         
         //End loop
        letters = 100;}
        
        //Go to the next character
         letters+=1;
    }
    
    //Get the number and the street name separately
    String add4 = this.streetAddress.substring(0,cut);
    String add2 = temp.streetAddress.substring(cut);
        
       //Test to see if the street names are the same
   if (add1.equals(add2)){
       
       //Comapares the street numbers
    return add3.compareTo(add4);}
   else 
   
   //compares the street names
   return add1.compareTo(add2);
      
   }
   
   public String getAdd(){
       return this.streetAddress;}


   //-----------------------------------------------------------------
   //  Returns this Address object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}
