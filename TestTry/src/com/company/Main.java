package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            throw null;
        } finally {
            return;
        }
    }
}
