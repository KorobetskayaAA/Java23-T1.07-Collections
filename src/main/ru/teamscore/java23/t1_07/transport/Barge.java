package ru.teamscore.java23.t1_07.transport;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Barge implements Transport {
    Set<Carriage> carriages = new HashSet<Carriage>();

    @Override
    public double getCapacity() {
        return 1000000;
    }

    public double getTotalWeight() {
        return carriages
                .stream()
                .collect(Collectors.summarizingDouble(Carriage::getWeight))
                .getSum();
    }

    @Override
    public void load(Carriage carriage) {
        if (canLoad(carriage)) {
            carriages.add(carriage);
        }
    }

    @Override
    public boolean canLoad(Carriage carriage) {
        return getTotalWeight() + carriage.getWeight() <= getCapacity();
    }
}
