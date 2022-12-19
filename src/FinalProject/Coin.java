package FinalProject;

import java.util.Random;

public class Coin {
    private String side;
    final String HEADS = "heads";
    final String TAILS = "tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip (){
        Random random = new Random();
        if(random.nextBoolean()){
            setSide(HEADS);
        }else {
            setSide(TAILS);
        }
        return getSide();
    }
}
