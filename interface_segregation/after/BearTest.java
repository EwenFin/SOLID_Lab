import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BearTest{

  Bear bear;
  PandaBear pandaBear;
  PoohBear poohBear;
  PolarBear polarBear;
  Salmon food;

  @Before
  public void setup(){
    bear = new Bear();
    pandaBear = new PandaBear();
    poohBear = new PoohBear();
    polarBear = new PolarBear();
    food = new Salmon();
  }

  @Test
  public void canEatSalmon(){
    poohBear.eat(food);
    assertEquals(1, poohBear.foodCount());
  }

  @Test
  public void cantEatIfBellyFull(){
    for (int i = 0; i < 7; i++){
      bear.eat(food);
    }
    assertEquals(5, bear.foodCount());
  }

  @Test
  public void canFishSalmon(){
    Edible freshSalmon = poohBear.riverFish();
    assertEquals(Salmon.class, freshSalmon.getClass());
  }

  @Test
  public void canFishSeal(){
    Edible freshSeal = polarBear.iceFish();
    assertEquals(Seal.class, freshSeal.getClass());
  }

  @Test
  public void canHarvestHoney(){
    Edible freshHoney = poohBear.harvestHoney();
    assertEquals(Honey.class, freshHoney.getClass());
  }

  @Test
  public void canHarvestBamboo(){
    Edible freshBamboo = pandaBear.harvestBamboo();
    assertEquals(Bamboo.class, freshBamboo.getClass());
  }

}