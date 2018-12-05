// QuartsToGallons.java
// This program converts Quarts to Gallon
class QuartsToGallons {    
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;  // constant value
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;

      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;

      System.out.println("A job that needs " + quartsNeeded + " quarts requires " + 
                                      gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts."); 
   }
}
