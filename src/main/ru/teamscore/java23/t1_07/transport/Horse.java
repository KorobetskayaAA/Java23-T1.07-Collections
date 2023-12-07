package ru.teamscore.java23.t1_07.transport;

public class Horse implements Transport, Carriage {
    Carriage carriage;

    @Override
    public double getCapacity() {
        return 1000;
    }

    @Override
    public void load(Carriage carriage) {
        if (canLoad(carriage)) {
            this.carriage = carriage;
        }
    }

    private void walk() {}

    @Override
    public double getWeight() {
        return 250;
    }
}
