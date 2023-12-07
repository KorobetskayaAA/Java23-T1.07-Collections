package ru.teamscore.java23.t1_07.genericid;

import java.util.UUID;

public class IdMain {
    public static void main(String[] args) {
        Identity<String> strId = new Identity<String>("XYZ-58546802");
        System.out.println(strId);
        Identity<UUID> guidId = new Identity<>(UUID.randomUUID());
        System.out.println(guidId);
        var intId = new Identity<>(10);
        System.out.println(intId);
    }
}
