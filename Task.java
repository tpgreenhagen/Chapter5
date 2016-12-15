

/**
 * Write a description of class Task here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
           if (this.pri > temp.pri)
            return 1;
           else if (this.pri == temp.pri)
           return 0;
           else
           return -1;}
       
   public double getPriority(){
    return pri;}
    
    public void setPriority(double p){
    this.pri = p;}
    
    public String toString(){
    return this.pri+" "+this.job;}
    
}
