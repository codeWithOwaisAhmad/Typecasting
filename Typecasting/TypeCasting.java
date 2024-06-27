public class TypeCasting {
  public static void main(String[] args) {
      //So this is an Example of Implicit Typecasting in which compiler converts the int datatype to double explicitly
      //because double has 8 bytes and int has 4 bytes as it is shorter then double
      int a = 5;
      double d = 5.5;
      double sum = a + d;
      System.out.println(sum);
      //Explicit Typecasting
      //In this example We have done Explicit Typecasting by converting int to double
      int b = 5;
      double c = 5.5;
//        c = b;
//        System.out.println(c);
      // Now We will convert Double to int Explicitly
      // b = c; It is Showing error because We cannot convert double to int without using cast operator
      //Now Using Cast Operator
//        b = (int) c;
//        System.out.println(b);
      //Now Float and integer
      float f = 7.7f;
      //b = f; Not Possible Implicitly
      //Now Using Casting Operator
//        b = (int) f;
//        System.out.println(b);
//        f = b;
//        System.out.println(f);
      //ParseInt Operator
      //It is used if we have takenw
      int e = Integer.parseInt("123");
      System.out.println(e);
      float num1 = 16.3f;
      int a4 = 35345;
//        double num2 = 12.6;
//        num1 = (float)num2;
//        System.out.println(num1)
      //ToString Method is used to convert integer value  to  a string value
      String name = Integer.toString(a4);
      //ToBinaryString Method is used to convert the integer value to its binary value
      name = Integer.toBinaryString(a4);
      System.out.println(name);
//        System.out.println(name + 8);
  }
}
