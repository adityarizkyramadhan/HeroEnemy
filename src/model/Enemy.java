package model;

public class Enemy {
    private String name;
    private int health;
    private int armor;
    private int attack;
    private Hero hero;

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
    public Hero getHero(){
        return hero;
    }
    public void setHero(Hero hero){
        this.hero = hero;
    }

    public boolean isDead(){
        return health <= 0;
    }

    public void attackHero(){
        if (this.hero == null){
            System.out.println("Hero not set");
            return;
        }
        int healthHero = this.hero.getHealth() - this.attack;
        if (healthHero >= 0){
            hero.setHealth(healthHero);
            System.out.printf("Hero : %s \nHealth : %d\nHero still alive\n", this.hero.getName(), hero.getHealth());
        }else {
            System.out.printf("Hero : %s \nHealth : %d\nHero dead\n", this.hero.getName(), hero.getHealth());
            hero.setHealth(0);
        }
    }
}
