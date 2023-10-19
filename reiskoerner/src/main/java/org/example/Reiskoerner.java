package org.example;

public class Reiskoerner {
    public static int addReiskoerner(int riceGrain, float increase) {
        riceGrain = (int) (riceGrain * ((increase / 100) + 1));
        return riceGrain;
    }

    public static void main(String[] args) {
        int riceGrain = 10; // THe Starting amount of rice grain
        int maxRounds = 10; // The Maximum amount of rounds played meaning the amount of fields on the Board
        float increaser = 0f; //Increaser in percentage as a whole number e.g. 100 meaning increase of 100% of the rice grain = double rice grain per round
        for (int round = 0; round < maxRounds; round++) {
            if (riceGrain == 1) {
                System.out.printf("In Runde " + (round + 1) + " liegt " + riceGrain + " Reiskorn auf dem Brett. \n");
            } else {
                System.out.printf("In Runde " + (round + 1) + " liegen " + riceGrain + " Reiskörner auf dem Brett. \n");
            }
            riceGrain = addReiskoerner(riceGrain, increaser);
        }
    }
}