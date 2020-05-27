public class Smartphone extends Handphone //ineritance
{
   public Smartphone (String newType)
   {
      super (newType);
   }
   
   public void Internet()
   {
      System.out.println("Smartphone can access Internet.");
   }
   
   public void Apps()
   {
      System.out.println("Smartphone can download :Whatsapp, Wechat, Facebook, Instagram");
   }
   
   public void System()
   {
      System.out.println("Smartphone normally used : iOS or Android");
   }
   
   public void Function() //Overriding
   {
      System.out.println("Smartphone can take photo");
   }
   
   
}