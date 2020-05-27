public class Nokia3310 extends Cellphone //inheritance
{
   private String price;
   private String feature ;
    
   public Nokia3310 (String newType)
   {
      super(newType);
   }
   
   public void Advantages(String price)
   {
      System.out.println("Nokia 3310 is " + price);

   }
   
   public void Advantages(String price, String feature)
   {
      System.out.println("Nokia 3310 is " + price);
      System.out.println("Nokia 3310 is more " + feature);
      System.out.println("Nokia 3310 has a longer battery life");
   }
   
   public void Disadvantages()
   {
      System.out.println("Nokia 3310 dosen't have touch screen");
      System.out.println("Nokia 3310 cannot access to internet");
   }
   
   public void Type()
   {
      System.out.println("Nokia 3310 is a "+ type );
   }
} 