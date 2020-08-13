import java.util.*;

import java.io.*;
 

class Registrations 

{
    String name;
    
     List<String> part = new ArrayList<>();
 
        Scanner get = new Scanner(System.in);
   
Registrations()
    
{
       
       
     System.out.println("**************************");
  
     System.out.println(" 1    Registor"); 
       
     System.out.println(" 2    Remove");
       
     System.out.println(" 3    No of events participated");
       
     System.out.println("Enter your  preference:");  
       
    int c = get.nextInt();
      
    switch (c) 
    {
         
      case 1:
           
       reg();
           
       break;
         
      case 2:
           
     remove();
           
       break;
         
      case 3:
           
      NOFE();
           
      break;    
        
      default:
  System.out.println("Enter Your preference:");

         };
 
    }
   
 void reg()
   
 {
       
   String garbage = get.nextLine();
       
    System.out.println("Enter the Name:");
        
    String name = get.nextLine();
       
     part.add(name);
       
      System.out.println("Added!");
        
       NOFE();
  
     }
    
 void remove()
    
{
        
     String name;
        
     String garbage = get.nextLine();
        
       System.out.println("Enter the Name:");
        
           name = get.nextLine();
        
          boolean t = part.contains(name);
        
         if(t==true)
        
             {
           
                part.remove(name);
            
                System.out.println("participant removed!");
        
         }
        
          else
        
             {
            
               System.out.println("Person has not yet registerred!");
     
                }
   
             }
   
   void NOFE()
    
 {
       
      for (int i=0; i < part.size(); i++)
      
            {

            
               System.out.println(" " + i + "           "+ part.get(i)); 
      
              }
     
   }

}
 

public class EventManagements
 
{
    
     public static void main(String[] args)
   
          {
       
             Scanner get = new Scanner(System.in);
       
               Registrations Obj = new Registrations();
       
                Obj.remove();
    
             }

}