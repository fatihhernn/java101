package BoxGame;

import BoxGame.Fighter;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("A",10,120,100,45,0);
        Fighter f2=new Fighter("B",20,85,85,40,0);

        Match match=new Match(f1,f2,85,100);
        match.run();
    }
}
