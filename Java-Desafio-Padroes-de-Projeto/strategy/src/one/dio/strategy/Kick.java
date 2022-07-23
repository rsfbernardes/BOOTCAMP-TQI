package one.dio.strategy;

public class Kick implements Attack{
    @Override
    public void attack() {
        System.out.println("Kicked!");
    }
}
