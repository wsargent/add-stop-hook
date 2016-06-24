package services;

import play.inject.ApplicationLifecycle;
import play.libs.F;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ServiceTwo {

    @Inject
    public ServiceTwo(ApplicationLifecycle lifecycle) {
        lifecycle.addStopHook(() -> F.Promise.promise(() -> {
            System.out.println("ServiceTwo");
            return null;
        }));
    }
}
