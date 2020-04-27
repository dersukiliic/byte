package bytekod;

//Java program to demonstrate 
//allocate() method 

import java.nio.*; 
import java.util.*; 

public class GFG { 

 public static void main(String[] args) 
 { 

     // Declaring the capacity of the ByteBuffer 
     int capacity = 4; 

     // Creating the ByteBuffer 
     try { 

         // creating object of ByteBuffer 
         // and allocating size capacity 
         ByteBuffer bb = ByteBuffer.allocate(capacity); 

         // putting the int to byte typecast value 
         // in ByteBuffer using putInt() method 
         bb.put((byte)20); 
         bb.put((byte)30); 
         bb.put((byte)40); 
         bb.put((byte)50); 
         bb.rewind(); 

         // print the ByteBuffer 
         System.out.println("Original ByteBuffer:  "
                            + Arrays.toString(bb.array())); 
     } 

     catch (IllegalArgumentException e) { 

         System.out.println("IllegalArgumentException catched"); 
     } 

     catch (ReadOnlyBufferException e) { 

         System.out.println("ReadOnlyBufferException catched"); 
     } 
 } 
} 
