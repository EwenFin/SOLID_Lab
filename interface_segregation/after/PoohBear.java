public class PoohBear extends Bear implements PoohBearable{
 
  public Salmon riverFish(){
    return new Salmon();
  }
  

 public String climbTree(){
   return "I can climb this tree, you can't hide from me!";
 }
 
 public Honey harvestHoney(){
   return new Honey();
 }
  

}