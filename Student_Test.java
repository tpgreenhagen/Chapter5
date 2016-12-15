
/**
 * Write a description of class Student_Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student_Test
{
   public static void main (String[] args)
   {
    
    
    
        Address home = new Address("456 Elm st", "Naperville", "IL", 60565);
        Address school = new Address("540 W Auora Ave", "Naperville","IL",60540);
        Address a1 = new Address("345 Harper Road","Madison","IL",60789);
        Address a2 = new Address("987 West Street","Naperville","IL",60789);
        Address a3 = new Address("122 Riverwoods Drive","Naperville","IL",60789);
    
        Student Taylor = new Student("Taylor","Swift",home, school,123);
        Student Jill = new Student("Jill","Jones",home,school,987);
        Student Jill2 = new Student("Jill","Jones",home,school,567);
        Student Jacoob = new Student("Jacoob","Gewerges",home, school,435);
        Student Tanner = new Student("Tanner","Greenhagen",home, school,111);
        Student Sam = new Student("Sam","Piazza",home, school,999);
        Student Alec = new Student("Alec","Gamer",home, school,890);
        Student George = new Student("George","Ann",home, school,448);
        Student Zeon = new Student("Zane","Zeon",home, school,832);
        Student Buffalo = new Student("Buffalo","Bill",home, school,278);
        Student Cameron = new Student("Cameron","Carro",home, school,900);
        
//         System.out.println(Jill.compareTo(Taylor));
//         System.out.println(Jill.compareTo(Tom));
        
//         Student[] people = {Taylor,Tom,Jacoob, Tanner, Buffalo, Cameron, Sam, Alec, Zeon, George, Jill};
//         
//         for (Student s:people)
//         System.out.println(s.get_name()+" "+s.get_Lname()+" "+s.get_id());
//         
//         System.out.println("\n\n");
//         
//         Sorts.insertionSort(people);
//         for (Student s:people)
//         System.out.println(s.get_name()+" "+s.get_Lname()+" "+s.get_id());
//         
//        
        
    //     System.out.println(Student.get_pop());
    //     System.out.println(Jacoob.get_pop());
        //System.out.println(Jacoob);

      System.out.println(Taylor.Equals(Jill));
      System.out.println(Jill2.Equals(Jill));
       

    }//end of main
}
