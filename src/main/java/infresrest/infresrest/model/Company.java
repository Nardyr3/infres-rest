package infresrest.infresrest.model;

import java.util.Random;

public enum Company {
    AirFrance, RyanAir, Hop, Easyjet, Luftansa;

    public static Company randomEnum(){
        Random random = new Random();
        int x = random.nextInt(Company.values().length);
        return Company.values()[x];
    }
}
