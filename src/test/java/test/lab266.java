package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab266 {

    //Integration //
    //Create Booking ->ID
    //Create Auth -> Token
    //PUT ->ID , Tokan
   // Delete -> ID
   //GET -> ID -- verify it should not exit.


    //Boiler plate code

   String tokan ;
   Integer bookingID;
   public String getTokan(){
       tokan ="1243";
       return tokan ;
   }
     @BeforeTest
    public  void getTokanAndBookingID(){
       tokan =getTokan();
       //POST Req
         //POST code
         bookingID=123;
     }
//PUT Code
     @Test
    public void testPUTReq(){
         System.out.println(tokan);
         System.out.println(bookingID);
         //PUT Code
     }
     //Delete Code
    @Test
    public void testDeleteReq() {
        System.out.println(tokan);
        System.out.println(bookingID);
        //Delete Code
    }
    @Test
    public void testGETReq() {
        System.out.println(tokan);
        System.out.println(bookingID);
        //GET Code
    }







}
