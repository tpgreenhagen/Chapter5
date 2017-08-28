

/**
 * Tanner Greenhagen
 * 12/16/16
 * Task Program
 * Will organize tasks by priority.
 */

import java.util.Scanner;
public class Task implements Comparable, Priority
{
    private String job;
    private double pri;
    public Task(double number,String name){
        this.job = name;
        this.pri = number;}
        
        
    public int compareTo(Object obj)
       {    Task temp = (Task)obj;
           
           //If this object's priority is greater than the parameter object's priority returns 1
           if (this.pri > temp.pri)
            return 1;
            //If this object's priority is equal than the parameter object's priority returns 0
           else if (this.pri == temp.pri)
           return 0;
           //If this object's priority is less than the parameter object's priority returns -1
           else
           return -1;}
       
   public double getPriority(){
    return pri;}
    
    
    public void setPriority(double p){
    this.pri = p;}
    
    /**
     * toString()
     * display the priority then the name
     */
    public String toString(){
    return this.pri+" "+this.job;}
    
}
