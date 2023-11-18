// //Q1)//write a program to demonstrate method overloading in 3 different parameter

// class Assingment {

//     public String ConcatenateStrings(String str1, String str2) {
//         String string_result = str1 + " " + str2;
//         return string_result;
//     }

//     public String ConcatenateStrings(String str1, String str2, String str3) {
//         String string_result = str1 + " " + str2 + " " + str3;
//         return string_result;
//     }

//     public String ConcatenateStrings(String str1, String str2, String str3, String str4) {
//         String string_result = str1 + " " + str2 + " " + str3 + " " + str4;
//         return string_result;
//     }

//     public String ConcatenateStrings(String str1, String str2, String str3, String str4, String str5) {
//         String string_result = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
//         return string_result;
//     }
// }

//     public class assingment {
//         public static void main(String[] args) {
//             Assingment obj = new Assingment();
//             String string_result1 = obj.ConcatenateStrings("KTM", "pulsar");
//             String string_result2 = obj.ConcatenateStrings("BMW", "bullet","kuwasaki");
//             String string_result3 = obj.ConcatenateStrings("honda", "R15","Activa","Fascino");
//             System.out.println(string_result1);
//             System.out.println(string_result2);
//             System.out.println(string_result3);

//         }
//     }
// ---------------------------------------------------------------------------------------------------------------------------------------
// //   Q2)  //write a program to create an object of a class which contain a method and call that class methoa in main method

//  class laptop{

//     String lp_brand;
//     String processor;
//     int    RAM;
//     String bodytype;
//     boolean ms_office;

//     void storage(){
//         System.out.println("it stores the data");
//     }
//     void speed(){
//         System.out.println("it is speed excecution of data");
//     }
//     void health(){
//         System.out.println("depends of health");
//     }
//     void Os(){
//         System.out.println("which os our laptop is?");
//     }
//     public static void main(){
    
//     laptop pc1 = new laptop();
//     laptop pc2 = new laptop();
//     laptop pc3 = new laptop();

//     pc1.storage();
//     pc1.speed();
//     pc2.health();
//     pc2.Os();
//     pc3.health();
//     }
// }
// -----------------------------------------------------------------------------------------------------------------------------

// // Q3)//write a java program to calculate the sum of all the elements in an integer array

// public class sumofarray {
//     public static void main(String[] args) {
//         // Sample array
//         int[] numbers = {1, 2, 3, 4, 5};

//         // Calculate the sum
//         int sum = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             sum += numbers[i];
//         }

//         // Print the result
//         System.out.println("Sum of the array elements: " + sum);
//     }
// }
// ----------------------------------------------------------------------------------------------------------------------------------------
// // Q4)//write a java program to find the index of a specific element in an integer array

// public class index {
//     public static void main(String[] args){
//     int array[] = {1,2,3,4,5};
//     for(int i=0;i<=array.length;i++){
//         System.out.println(i);

//     }
    
//     System.out.println();
// }

// }

// ----------------------------------------------------------------------------------------------------------------------------------------
// // Q5)
// public class entire_array {
//     public static void main(String[] args){
//      String cars_collection[] = {"BMW","Mercedes","Suzuki"};
//      for (int i = 0; i < cars_collection.length ;i++){
//     System.out.println(cars_collection[i] + " ");
// }
//     }


