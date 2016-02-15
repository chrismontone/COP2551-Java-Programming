public class Car implements Transmission
{
   private String make;
   private String model;
   private int year, speeds, tnxCode;
   //tnxCode: 0 if manual, 1 if automatic
   
   public Car (String cMake, String cModel, int year,
          int cTnxCode)
   {
      make = cMake;
      model = cModel;
      this.year = year;
      tnxCode = cTnxCode;
   }  
   public void setMake (String xMake)
   {
      make = xMake;
   }   
   public void setModel (String a123)
   {
      model = a123;
   }
   
   public void setYear (int year)
   {
      this.year = year;
   }
   
   public String getMake ()
   {
      return make;
   }
   
   public String getModel()
   {
      return model;
   }
   
   public int getYear(){
      return year;}
      
   //from the Transmission interface
   public boolean automatic()
   {
     if (tnxCode == 1)
     return true;
     else
     return false;
   }
   //how many speeds this car has
   public void gears(int x)
   {
      speeds = x;
   }
  
   public String toString()
   {
      return ("Make: " + make + "\tModel: " + getModel() + "\tYear: " + year);
   }
}
