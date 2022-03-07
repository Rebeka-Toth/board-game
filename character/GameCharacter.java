package character;

import helper.TestDiceRolls;

public abstract class GameCharacter {
    private double healthPoint;
    private final double attackPoint;
    private final Position position;
    private final char initial;

    public GameCharacter(final double healthPoint, final double attackPoint, final Position position,
            final char initial) {
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
        this.position = position;
        this.initial = initial;
    }

    public double getHealthPoint() {
        return this.healthPoint;
    }

    public void setHealthPoint(final double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getattackPoint() {
        return this.attackPoint;
    }

    public Position getPosition() {
        return this.position;
    }

    public char getInitial() {
        return this.initial;
    }

    public void printGameCharacter() {
        System.out.println(this.initial + " = " + "{ a: " + this.attackPoint + ", h: "
                + (this.healthPoint < 0 ? "0" : this.healthPoint) + ", p: " + this.position.getPositionString() + " }");
    }

    public void fight(final GameCharacter GameCharacter) {
        final double damage = this.attack();
        System.out.println(this.initial + " attack:  " + damage);
        final double newHeroHealth = GameCharacter.getHealthPoint() - damage;
        GameCharacter.setHealthPoint(newHeroHealth);
        GameCharacter.printGameCharacter();
        if (GameCharacter.getHealthPoint() <= 0) {
            System.out.println("-----" + GameCharacter.getInitial() + " DEAD-----");
        }
    }

    public abstract double attack();
}