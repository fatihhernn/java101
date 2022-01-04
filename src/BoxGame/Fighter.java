package BoxGame;

public class Fighter {
    private String name;
    private int damage;
    private int health;
    private int weight;
    private int dodge;
    private int first;

    int hit(Fighter foe){
        System.out.println(this.getName()+" => "+foe.getName()+" "+ getDamage()+" hasar vurdu. ");
        if (foe.isDodge()){
            System.out.println(foe.getName()+" gelen hasari blokladi!");
            System.out.println("--------------");
            return foe.getHealth();
        }
        if (foe.getHealth()-this.getDamage()<0){
            return 0;
        }
        return foe.getHealth()-this.getDamage();
    }

    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return this.getDodge()>=randomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public Fighter(String name, int damage, int health, int weight, int dodge, int first) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge=dodge;
        this.first=first;
    }
}
