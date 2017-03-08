import java.util.ArrayList;

public class Bear implements Bearable{

  // The Interface Segregation Principle states that:
  // "No client should be forced to depend on methods it does not use"

  // This Bear class has quite a few methods it probably won't use, I can't imagine the same Bear needing all of them.

  // It *must* implement all these methods as it's implementing the horribly bloated (and horribly named) "Bearable" interface.

  private ArrayList<Edible> belly = new ArrayList<Edible>();

 

  public int foodCount(){
    return belly.size();
  }

  public boolean isBellyFull(){
    return (foodCount() >= 5);
  }



 

 

  public String sleep(){
    return "Zzzzz...";
  }

 

  

  public void eat(Edible food){
    if (!isBellyFull()){
      belly.add(food);
    }
  }

}
