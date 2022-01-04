package BoxGame;

import BoxGame.Fighter;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (isCheck()){
            while (this.f1.getHealth()>0&&this.f2.getHealth()>0){

                System.out.println();
                System.out.println("=== YENI ROUND ===");

                if (whoFirst()){
                    f2.setHealth(f1.hit(f2));
                    if (isWin()){
                        break;
                    }
                    f1.setHealth(f2.hit(f1));
                    if (isWin()){
                        break;
                    }
                }else {
                    f1.setHealth(f2.hit(f1));
                    if (isWin()){
                        break;
                    }
                    f2.setHealth(f1.hit(f2));
                    if (isWin()){
                        break;
                    }
                }


                System.out.println(f2.getName()+"'nın sagligi "+""+f2.getHealth());
                System.out.println(f1.getName()+"'nın sagligi "+""+f1.getHealth());
            }
        }
        else {
            System.err.println("Sporcuların sikletleri uymuyor.");
        }
    }

    private boolean isCheck() {
        return (this.f1.getWeight()>=minWeight&&this.f1.getWeight()<=maxWeight)&&((this.f2.getWeight()>=minWeight&&this.f2.getWeight()<=maxWeight));
    }
    boolean isWin(){
        if (this.f1.getHealth()==0){
            System.out.println(f2.getName()+" kazandi! ");
            return true;
        }
        if (this.f2.getHealth()==0){
            System.out.println(f1.getName()+" kazandi! ");
            return true;
        }
        return false;
    }
    boolean whoFirst(){
        Random ran = new Random();
        int x = ran.nextInt(2); //Generate 0 or 1
        if(x == f1.getFirst()){
            return true;
        }
        return false;
    }
}
