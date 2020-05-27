public class iPhone12ProMax extends Smartphone//inheritance
{
   private String material; //encapsulation
   private int numOfCamera;
   
   public iPhone12ProMax (String newType)
   {
      super(newType); 
   }
   
   public void setMaterial (String newMaterial)
   {  material = newMaterial; }
   
   public String getMaterial (String newMaterial)
   {  return material;  }
   
   public void setNumOfCamera (int newNum)
   {  numOfCamera = newNum;   }
   
   public int getNumOfCamera (int newNum)
   {  return numOfCamera;  }
   
   public void Design()
   {
      System.out.println("iPhone 12 Pro Max is made by : " + material);
      System.out.println("iPhone 12 Pro Max has "+ numOfCamera + " camera.");
   }
   
   public void Component()
   {  
      System.out.println("iPhone 12 Pro Max used A13 Bionic as processor");
      System.out.println("iPhone 12 Pro Max has Face Unlock");
   }
   
   public void Type()
   {
      System.out.println("iPhone 12 Pro Max is a " + type );
   }
}
