/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodilityflags;
import java.util.*;
/**
 *
 * @author ps
 */
public class JavaCodilityFlags {

    static int peak=0;
    static int  position(int []args , int position)
    {
        int prev=position;
        position++;
        
        
       
        while(args[position]>= args[prev]  )
        {
             System.out.println("My  increment+"+position);
             prev=position;
           
            position++;
        }
        peak=1;
        return position;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] mass = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };
        List mypeaks=new ArrayList();
        
        int pos=0;
        int count=0;
        do
        {
            
             if(pos+1== mass.length)
                 break;
             pos=position(mass,pos);
             
             if(peak==1)
             {
             int value=pos-1;    
             mypeaks.add(value);
           
             count++;
             peak=0;
             }
         }
         while(pos<mass.length);
          int size=mypeaks.size();
          
         while(size>1)
         {
             int checker=0;
             for(int i=0;i<mypeaks.size()-1;i++)
             {
                 int distance=(int)mypeaks.get(i+1)-(int)mypeaks.get(i);
                 if(distance < size )
                 {
                     System.out.println("element="+mypeaks.get(i+1));
                     mypeaks.remove(i+1);
                     System.out.println(mypeaks);
                     checker=1;
                     break;
                 }
             }
            
             if(checker==0)
             {
                 break;
             }
              size--;
             
         }
         System.out.println(size);
         }
    
    }
    

