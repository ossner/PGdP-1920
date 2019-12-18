package pgdp.oop;

import java.awt.Toolkit;
import java.io.File;

public class Fish extends Animal {
  static String filename = "fish.png";

  public Fish(int x, int y) {
    super(x, y);

    f = new File(filename);
    image = Toolkit.getDefaultToolkit().getImage(f.getAbsolutePath());
  }

  public boolean canEat(Animal animal) {
    return animal.eatenBy(this);
  }

  protected boolean eatenBy(Penguin penguin){
    return true;
  }

  protected boolean eatenBy(PlayerPenguin playerPenguin){
    return true;
  }

  protected boolean eatenBy(Whale whale){
    return false;
  }

  protected boolean eatenBy(LeopardSeal leopardSeal){
    return true;
  }

  protected boolean eatenBy(Fish fish){
    return false;
  }

}
