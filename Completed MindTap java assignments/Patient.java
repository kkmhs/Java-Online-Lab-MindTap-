public class Patient
{
   private String id;
   private int age;
   private BloodData blood = new BloodData();
   
   public Patient()
   {
      id = ("0");
      age = 0;
      blood.setBloodType("O");
      blood.setRhFactor("+");
   }
   public Patient(String id, int age, String bType, String rhFactor)
   {
      this.id = id;
      this.age = age;
      blood.setBloodType(bType);
      blood.setRhFactor(rhFactor);
   }
   public String getId()
   {
      return id;
   }
   public void setId(String id)
   {
      this.id = id;
   }
   public int getAge()
   {
      return age;
   }
   public void setAge(int age)
   {
      this.age = age;
   }
   public BloodData getBloodData()
   {
      return blood;
   }
   public void setBloodData(BloodData b)
   {
      this.blood = blood;
   }
}
