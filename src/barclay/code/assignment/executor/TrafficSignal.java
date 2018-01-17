package barclay.code.assignment.executor;

public class TrafficSignal {

    public void printTrafficPatter() {
        System.out.println("#### Print Traffic Patter ####\n\n");

        int N = 0, S = 0, W = 0, E = 0;
        boolean snellFlag = true;
        boolean weaverFlag = false;

        // 20 iterations for 20 Seconds
        System.out.println("0: N = " + N + "; S = "+ S + "; E = "+ E + "; W = "+ W);
        for (int i = 1; i <= 20; i++) {
            N += 1;
            S += 1;
            E += 1;
            W += 1; // Adding 1 as every second a new car comes to the traffic signal

            if (i % 8 == 0)
                weaverFlag = false;
            else if ((i - 2) % 8 == 0)
                snellFlag = true;
            else if ((i - 4) % 8 == 0)
                snellFlag = false;
            else if ((i - 6) % 8 == 0)
                weaverFlag = true;

            if (snellFlag) {
                N -= 1;
                S -= 1; // Car Movement on Snell Road;
            } else if (weaverFlag) {
                E -= 1;
                W -= 1; // Car Movement on Weaver Road;
            }
            System.out.println(i + ": N = " + N + "; S = " + S + "; E = " + E + "; W = " + W);
        }
        System.out.println("\n\n");
    }
}
