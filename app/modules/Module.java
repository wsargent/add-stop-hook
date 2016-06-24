package modules;

import com.google.inject.AbstractModule;
import services.ServiceOne;
import services.ServiceTwo;

public class Module extends AbstractModule {
    protected void configure() {
        bind(ServiceOne.class).asEagerSingleton();
        bind(ServiceTwo.class).asEagerSingleton();
    }
}
