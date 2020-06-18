package Wrappers;

// Демонстрация оболочки числового типа
class Wrap {
     public static void main(String[] args) {
         Integer iOb = new Integer(100);
         int i = iOb.intValue();
         System.out.println("int i = " + i + " and iOb = " + iOb);

         // точно такое же пример, как и сверху
         // но используется автоупаковка и автораспаковка

         Integer iOb1 = 100;
         int val = iOb1;
         System.out.println("int val = " + val + " and iOb1 = " + iOb1);

     }
}
