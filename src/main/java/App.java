import ws.TesteWebService;

import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class App extends Application {

    private Set<Class<?>> classes;

    public App(){


        classes = new HashSet<Class<?>>();

        classes.add(TesteWebService.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return this.classes;
    }
}
