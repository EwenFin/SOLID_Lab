public class PandaBear extends Bear implements PandaBearable{

  public String climbRock(){
    return "I'm on a rock, not much to do up here, nice spot for a sleep maybe.";
  }
  
  public Bamboo harvestBamboo(){
    return new Bamboo();
  }
}