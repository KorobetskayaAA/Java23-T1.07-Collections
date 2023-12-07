package ru.teamscore.java23.t1_07.coalesce;

import java.util.Arrays;

public class CoalesceMain {

    static <T> T coalesce(T deafultValue, T... arg) {
        return Arrays.stream(arg).findFirst().orElse(deafultValue);
    }
    public static void main(String[] args) {
        System.out.println(coalesce(0, 10, null, 5));
//        var options = coalesce(DEFAULT_OPTIONS,
//                optionsFromConfig(),
//                optionsFromArgs(args));
    }
}
