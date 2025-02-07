package config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigurationManager {

    //prevents instantiation (Singleton principle)
    private ConfigurationManager() {}

    //Returns a cached instance of the Configuration interface
    public static Configuration config(){
        return ConfigCache.getOrCreate(Configuration.class);
    }
}
