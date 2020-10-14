/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Lab_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
       
        thread t=new thread();
        t.start();
        t.join();
        thread1 t1=new thread1();
        t1.start();
        t1.join();
        thread2 t2=new thread2();
        t2.start();
        
        
    }
    
}
class thread extends Thread{
  public void run()
  {
      
      try {
        FileInputStream  fi = new FileInputStream("one.txt");
          int read,count=1;
    while((read=fi.read())!=-1)
    {
        if((char)read==' '||(char)read=='.')
            count++;
      } 
      System.out.println("one.txt: ----->"+count);
      }
    catch (FileNotFoundException e) {
          System.out.println(e);
      } catch (IOException ex) {
          Logger.getLogger(thread.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    
      
  }
}
class thread1 extends Thread{
    public void run(){
        try{
             FileInputStream  fi1 = new FileInputStream("customer.txt");
          int read,count=0;
    while((read=fi1.read())!=-1)
    {
        if((char)read==' '||(char)read=='.')
            count++;
      } 
      System.out.println("customer.txt: ----->"+count);
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
}
class thread2 extends Thread{
    public void run(){
        try{
             FileInputStream  fi2 = new FileInputStream("first.txt");
          int read,count=0;
    while((read=fi2.read())!=-1)
    {
        if((char)read==' '||(char)read=='.')
            count++;
      } 
      System.out.println("first.txt: ----->"+count);
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
}
    

 
