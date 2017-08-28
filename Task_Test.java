

/**
 * Tanner Greenhagen
 * 12/16/16
 * Task_Test
 * This will display the tasks in prirority order
 */
public class Task_Test
{
    public static void main(String [] args){
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



}
}
