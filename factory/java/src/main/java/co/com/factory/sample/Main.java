package co.com.factory.sample;

import co.com.factory.sample.constans.Constans;
import co.com.factory.sample.structure.Factory;


public class Main {

    private Factory factory = new Factory();

//  This will be an environment variable at the time of installation for construction companies.
    private static String platform = Constans.HOUSE;

    public static void main(String[] args) {
        Factory.planBuilding(platform);
        Factory.planStop(platform);
    }
}
