package com.phil.program;

import java.util.HashMap;
import java.util.Map;

public class Memory {
    private static final HashMap<String, Integer> RAM = new HashMap<>();

    public static int read(String address) {
        return RAM.get(address);
    }

    public static void write(String address, int value) {
        RAM.put(address, value);
    }

    public static void dump() {
        for (Map.Entry<String, Integer> entry : RAM.entrySet()) {
            System.out.print(String.format("%10s = %7s", entry.getKey(), entry.getValue()));
        }
    }
}
