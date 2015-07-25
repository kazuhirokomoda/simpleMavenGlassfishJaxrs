
package simple.maven.glassfish.jaxrs.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import simple.maven.glassfish.jaxrs.response.HelloMessage;
import simple.maven.glassfish.jaxrs.response.PathParamResult;

@Path("/simple")
public class SimpleResource {
    
    // ex) http://localhost:8080/simpleMavenGlassfishJaxrs/webresources/simple/hello/testtest
    @GET
    @Path("/hello/{message}")
    public HelloMessage helloMessage(@PathParam("message") String message) {
        HelloMessage helloMessage = new HelloMessage();
        helloMessage.setMessage("Hello, "+ message);
        return helloMessage;
    }
    
    // ex) http://localhost:8080/simpleMavenGlassfishJaxrs/webresources/simple/path_param_addition/4/7/
    @GET
    @Path("/path_param_addition/{op1}/{op2}/")
    public PathParamResult pathParamAddition(@PathParam("op1") int op1, @PathParam("op2") int op2) {
        int result = op1 + op2;
        PathParamResult pathParamResult = new PathParamResult();
        pathParamResult.setResult(Integer.toString(result));
        return pathParamResult;
    }

    
    @GET
    @Path("/path_param/{op1}_{op2}/")
    public String pathParamSample2(@PathParam("op1") int op1, @PathParam("op2") int op2) {
        int result = op1 / op2;
        return Integer.toString(result);
    }
    
}
