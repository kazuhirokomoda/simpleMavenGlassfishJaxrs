
package simple.maven.glassfish.jaxrs.common.config;

import io.swagger.jaxrs.config.BeanConfig;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import org.reflections.Reflections;
import simple.maven.glassfish.jaxrs.resource.SimpleResource;


@ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    // "simple.maven.glassfish.jaxrs.resource"
    private static final String RESOURCE_PACKAGE = SimpleResource.class.getPackage().getName();

    public ApplicationConfig() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("simpleMavenGlassfishJaxrs");
        beanConfig.setDescription("A simple Maven Glassfish JAX-RS project.");
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080"); // ex. "localhost:8002"
        beanConfig.setBasePath("/simpleMavenGlassfishJaxrs/webresources");  // ex. "/api"
        beanConfig.setPrettyPrint(true);

        beanConfig.setResourcePackage(RESOURCE_PACKAGE); // ex. "io.swagger.resources"
        beanConfig.setScan(true);
    }

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);

        // register JAX-RS resource class
        //new Reflections(RESOURCE_PACKAGE).getTypesAnnotatedWith(Path.class).forEach(resources::add);

        // enable Swagger
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(simple.maven.glassfish.jaxrs.resource.SimpleResource.class);
    }
    
}
