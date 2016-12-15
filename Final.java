

/**
 * Write a description of class Final here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
public class Final
{
  public static void main(String args[]){
      
      Random generator = new Random();
    String name = "Slim Shady";
 	//System.out.print(name.charAt(10));
 	System.out.print(name.substring(5,10));
System.out.print(name.compareTo("Slim Not so Shady"));
name.toLowerCase();
System.out.print(name);
System.out.println(name.indexOf("S"));
System.out.println(name.indexOf("p"));
int x = generator.nextInt(50)+1;
	int y = (int) (Math.random()*50)+1;
		System.out.println(x);
	System.out.println(y);
}

}
