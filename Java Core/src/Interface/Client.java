package Interface;

 class Client implements CallBack {
     // реализовать интерфейс CallBack
     public void callback(int p) {
         System.out.println("Метод callback(), вызываемый со значением " + p);
     }
}
