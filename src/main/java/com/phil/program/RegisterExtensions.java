package com.phil.program;

public class RegisterExtensions {
    static void dump(int[] registers) {
        for (int register : registers) {
            System.out.print("     " + register + " ");
        }
    }
}
