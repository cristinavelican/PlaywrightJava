package config;

import org.aeonbits.owner.Config;

import java.io.ObjectInputFilter;

public interface Configuration extends Config {
    @Config.Key("base.url")
    String baseUrl();

    @Key("base.test.data.path")
    String baseTestDataPath();

    @Key("base.test.video.path")
    String baseTestVideoPath();

    @Key("browser")
    String browser();

    @Key("headless")
    boolean headless();

    @Key("slow.motion")
    int slowMotion();

    int timeout();

    boolean video();
}
