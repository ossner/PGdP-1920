package pgdp.oop;

public class PlayerPenguin extends Penguin {
    public PlayerPenguin(int x, int y) {
        super(x, y);
    }

    public boolean canEat(Animal animal) {
        return animal.eatenBy(this);
    }

    protected boolean eatenBy(Penguin penguin){
        return false;
    }

    protected boolean eatenBy(PlayerPenguin playerPenguin){
        return false;
    }

    protected boolean eatenBy(Whale whale){
        return true;
    }

    protected boolean eatenBy(LeopardSeal leopardSeal){
        return false;
    }

    protected boolean eatenBy(Fish fish){
        return true;
    }
}
