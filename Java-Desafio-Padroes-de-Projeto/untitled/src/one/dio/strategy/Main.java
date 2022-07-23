package one.dio.strategy;

public class Main {

    public static void main(String[] args) {

        Attack toKick = new Kick();
        Attack toPunch = new Punch();

        Fighter fighter = new Fighter();
        fighter.setAttack(toPunch);
        fighter.toAttack();
        fighter.setAttack(toPunch);
        fighter.toAttack();
        fighter.setAttack(toPunch);
        fighter.toAttack();
        fighter.setAttack(toKick);
        fighter.toAttack();
    }
}
