package model;

public class Hero {
    private String name;
    private int health;
    private int armor;
    private int attack;
    private Enemy enemy;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public Enemy getEnemy() {
        return enemy;
    }
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }


    public void attackEnemy(){
        if (this.enemy == null){
            System.out.println("Hero not set");
            return;
        }
        int healthEnemy = this.enemy.getHealth() - this.attack;
        if (healthEnemy >= 0){
            this.enemy.setHealth(healthEnemy);
            System.out.printf("Hero : %s \nHealth : %d\nHero still alive\n", this.enemy.getName(), enemy.getHealth());
        }else {
            System.out.printf("Hero : %s \nHealth : %d\nHero dead\n", this.enemy.getName(), enemy.getHealth());
            enemy.setHealth(0);
        }
    }
}
