package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main (String args[]){
        Random random = new Random();
        int space=0;
        for (int i=0 ;  i<5 ; i++){
            int die = random.nextInt(6) + 1;
            space = space + die;
            if (space == 20) {
                System.out.println("You've rolled a " +die+". You're on space "+space+
                        ". Congrats, you win!");
                break;
            } else if (space>20) {
                System.out.println("You've rolled a " +die+". you lose!");
                break;
            } else {
                System.out.println("You've rolled a " +die+". You're on space "+space+
                        " and have "+ (20-space) +" more to go.");
            }


        }
    }
}
