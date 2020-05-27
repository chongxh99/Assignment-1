public class Cellphone extends Handphone //inheritance
{
   public Cellphone (String newType)
   {
      super (newType);
   }
   
   public void Appearance()
   {
      System.out.println("Cellphone has keypad");
      System.out.println("Cellphone is smaller in size");
   }
   
   public void System()
   {
      System.out.println("Cellphone normally used Graphical User Interface as running system.");
   }
   
   public void Function() // Overriding
   {
      System.out.println("Cellphone has flashlight");
   }
}