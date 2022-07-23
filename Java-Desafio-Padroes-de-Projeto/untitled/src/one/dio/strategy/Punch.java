package one.dio.strategy;

public class Punch implements Attack{
    @Override
    public void attack() {
        System.out.println("Punched!");
    }
}
