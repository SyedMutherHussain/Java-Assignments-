//   Q2)  write a program to create an object of a class which contain a method and call that class methoa in main method

class laptop{

   String lp_brand;
   String processor;
   int    RAM;
   String bodytype;
   boolean ms_office;

   void storage(){
     System.out.println("it stores the data");
    }

    void speed(){
     System.out.println("it is speed excecution of data");
     }

    void health(){
         System.out.println("depends of health");
    }

     void Os(){
         System.out.println("which os our laptop is?");
    }

public class q2{
public static void main(String[] args){
    
     laptop pc1 = new laptop();
     laptop pc2 = new laptop();
     laptop pc3 = new laptop();

    pc1.storage();
    pc1.speed();
    pc2.health();
    pc2.Os();
    pc3.health();
     }
     
}}
