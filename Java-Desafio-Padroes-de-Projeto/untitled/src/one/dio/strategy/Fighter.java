package one.dio.strategy;

public class Fighter {

    private Attack attack;

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public void toAttack() {
        attack.attack();
    }
}
