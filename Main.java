public class Main //main class
{ 
  public static void main (String [] args) //main method
  {    
      Handphone hp = new Handphone("Smartphone");
      hp.Call();
      hp.SMS();
      hp.PlayMusic();
      hp.PlayGame();
      System.out.println();
      
      Smartphone sp = new Smartphone("Smartphone");
      sp.Internet();
      sp.Apps();
      sp.System();
      sp.Function();
      System.out.println();
      
      iPhone12ProMax ip = new iPhone12ProMax("Smartphone");
      ip.Type();
      ip.setMaterial("glass");
      ip.setNumOfCamera(4);
      ip.Design();
      ip.Component();
      System.out.println();
      
      Cellphone cp = new Cellphone("Cellphone");
      cp.Appearance();
      cp.System();
      cp.Function();
      System.out.println();
      
      Nokia3310 nk = new Nokia3310("Cellphone");
      nk.Type();
      nk.Advantages("cheap", "durable"); //overloading
      nk.Disadvantages();
      System.out.println();
      nk.Advantages("really cheap"); // overloading
   }
}
