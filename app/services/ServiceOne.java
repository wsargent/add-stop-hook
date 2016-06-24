package services;

import play.inject.ApplicationLifecycle;
import play.libs.F;

import javax.inject.Inject;

public class ServiceOne {

    @Inject
    public ServiceOne(ApplicationLifecycle lifecycle) {
        lifecycle.addStopHook(() -> F.Promise.promise(() -> {
            System.out.println("ServiceOne");
            return null;
        }));
    }
}
