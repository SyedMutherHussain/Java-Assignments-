// //Q1)//write a program to demonstrate method overloading in 3 different parameter

class Assingment {

    public String ConcatenateStrings(String str1, String str2) {
        String string_result = str1 + " " + str2;
        return string_result;
    }

    public String ConcatenateStrings(String str1, String str2, String str3) {
        String string_result = str1 + " " + str2 + " " + str3;
        return string_result;
    }

    public String ConcatenateStrings(String str1, String str2, String str3, String str4) {
        String string_result = str1 + " " + str2 + " " + str3 + " " + str4;
        return string_result;
    }

    public String ConcatenateStrings(String str1, String str2, String str3, String str4, String str5) {
        String string_result = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        return string_result;
    }
}

    public class q1 {
        public static void main(String[] args) {
            Assingment obj = new Assingment();
            String string_result1 = obj.ConcatenateStrings("KTM", "pulsar");
            String string_result2 = obj.ConcatenateStrings("BMW", "bullet","kuwasaki");
            String string_result3 = obj.ConcatenateStrings("honda", "R15","Activa","Fascino");
            System.out.println(string_result1);
            System.out.println(string_result2);
            System.out.println(string_result3);

        }
    }