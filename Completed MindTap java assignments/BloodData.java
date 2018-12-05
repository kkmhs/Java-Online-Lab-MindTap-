public class BloodData
{
   private String bloodType;
   private String rhFactor;
   
   public BloodData()
   {
      setBloodType("O");
      setRhFactor("+");
   }
   public BloodData(String bType, String rh)
   {
      setBloodType(bType);
      setRhFactor(rh);
   }
   public void setBloodType(String bloodType)
   {
      this.bloodType = bloodType;
   }
   public String getBloodType()
   {
      return bloodType;
   }
   public void setRhFactor(String rhFactor)
   {
      this.rhFactor = rhFactor;
   }
   public String getRhFactor()
   {
      return rhFactor;
   }
}
