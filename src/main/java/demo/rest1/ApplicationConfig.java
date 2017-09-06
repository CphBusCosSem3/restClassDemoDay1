package demo.rest1;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(demo.rest1.NotFoundMapper.class);
        resources.add(demo.rest1.PersonResource.class);
        resources.add(demo.rest1.TestResource.class);
    }

}
