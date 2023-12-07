package ru.teamscore.java23.t1_07.transport;

public interface Transport {
    double getCapacity();

    void load(Carriage carriage);

    default boolean canLoad(Carriage carriage) {
        return carriage.getWeight() <= getCapacity();
    }
}
