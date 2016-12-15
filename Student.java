
public class Student implements Comparable
{
        private static int population;
        //public static int population;
        //When you make a static variable, only one variable of that name is made
        //interfaces are like a rule book
    
       private String firstName, lastName;
       private Address homeAddress;
       private  int ID;
    
       private static Address schoolAddress;
    
    
    
       /**
       //  Sets up this Student object with the specified initial values.
       */
       public Student (String first, String last, Address home)
       {
           //static var increase pop for ever student created in that school
           population ++; //System.out.println(population  );
    
          firstName = first;
          lastName = last;
          homeAddress = home;
          schoolAddress = home;
    
       }
       
        /**
       //  Sets up this Student object with  a school address.
       */
       public Student (String first, String last, Address home, Address school)
       {
           //static var increase pop for ever student created in that school
           population ++; //System.out.println(population  );
    
          firstName = first;
          lastName = last;
          homeAddress = home;
          schoolAddress = school;
    
       }
        /**
       //  Sets up this Student object with  a school address.
       */
       public Student (String first, String last, Address home, Address school, int id)
       {
           //static var increase pop for ever student created in that school
           population ++; //System.out.println(population  );
    
          firstName = first;
          lastName = last;
          homeAddress = home;
          schoolAddress = school;
       
          ID= id;
          
    
       }
        /**------------------------------------------------
        // returns the population = to the amount of student objects created
        */
           public static int get_pop ()
           {
               return population;
           }
    
    
        public Address getSchool()
        {
    
            return schoolAddress;
    
        }
    
    
        /**
          //  implement Comparable by make the compareTo method
          // 
       */
    
       public int compareTo(Object obj)
       {
            int result = 0;
           Student temp = (Student) obj;
//         if (this.lastName.equals(temp.lastName)){
//         result = this.firstName.compareTo(temp.firstName);
//         }
//         else
//         result = this.lastName.compareTo(temp.lastName);
            if (this.ID > temp.ID)
            result = 1;
            else if (this.ID == temp.ID)
            return 0;
            else
            return -1;
    
           return result;
       }
    
    
    
    
      public String get_name()
      {
        return firstName;
    
       }
    
       public String get_Lname()
      {
        return lastName;
    
       }
    
         public int get_id()
      {
        return ID;
    
       }
    

       public boolean Equals(Object obj){
           Student temp = (Student) obj;
        return (this.firstName.equals(temp.firstName) && this.lastName.equals(temp.lastName));
        
        
        }
    
       /**
       //  Returns this Student object as a string.
        @return ________
       */
       public String toString()
       {
          String result;
    
          result = firstName + " " + lastName + "\n";
          result += "Home Address:\n" + homeAddress + "\n";
          result += "School Address:\n" + schoolAddress;
    
          return result;
       }
}//end of Student
