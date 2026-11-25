public class StringIndex {
   public StringIndex() {
   }

   public static void main(String[] var0) {
      String var1 = "Sandy";

      try {
         System.out.println(var1.charAt(10));
      } catch (StringIndexOutOfBoundsException var3) {
         System.out.println("String is out!");
      }

   }
}