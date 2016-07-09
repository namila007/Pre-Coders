/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alien;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author Namz
 */
public class Alien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner(System.in);  // Reading from System.in
System.out.println("Enter an Alien number: ");
int pinumb = reader.nextInt(); 
String bits=null;
        String bin= Integer.toString(pinumb,2);
        int length=bin.length();
        System.out.println(bin.length());
    for (int i=0;i<33-length;i++){
       bin=0+bin;
        
       
    }
    
    String rev=new StringBuilder(bin).reverse().toString();
        System.out.println(rev);
           BigInteger i =new BigInteger(rev, 2);
      //String newbin=Integer.parseInt(i , 10);
        System.out.println(i);
     BigInteger e=new BigInteger("2");
    
    
    
        System.out.println("Value in our world:"+i.divide(e));     
    }
    
}
