
package simple.maven.glassfish.jaxrs.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import simple.maven.glassfish.jaxrs.response.HelloMessage;
import simple.maven.glassfish.jaxrs.response.PathParamResult;

@Path("/simple")
@Api(tags = {"simple"})
public class SimpleResource {

    /**
     * Append "Hello, " before the message.
     * ex) http://localhost:8080/simpleMavenGlassfishJaxrs/webresources/simple/hello/testtest
     * @param message
     * @return HelloMessage
     */
    @GET
    @Path("/hello/{message}")
    @ApiOperation(value = "Hello Message API",
            notes = "Append 'Hello, ' before the message.",
            response = HelloMessage.class)
    public HelloMessage helloMessage(@PathParam("message") String message) {
        HelloMessage helloMessage = new HelloMessage();
        helloMessage.setMessage("Hello, " + message);
        return helloMessage;
    }

    /**
     * Adds two numbers.
     * ex) http://localhost:8080/simpleMavenGlassfishJaxrs/webresources/simple/path_param_addition/4/7/
     * @param op1
     * @param op2
     * @return pathParamResult
     */
    @GET
    @Path("/path_param_addition/{op1}/{op2}/")
    @ApiOperation(value = "Path Param Addtion API",
            notes = "Adds two numbers.",
            response = PathParamResult.class)
    public PathParamResult pathParamAddition(@PathParam("op1") int op1, @PathParam("op2") int op2) {
        int result = op1 + op2;
        PathParamResult pathParamResult = new PathParamResult();
        pathParamResult.setResult(Integer.toString(result));
        return pathParamResult;
    }

    /**
     * Divide the first number by the second number.
     * @param op1
     * @param op2
     * @return pathParamResult
     */
    @GET
    @Path("/path_param_division/{op1}/{op2}/")
    @ApiOperation(value = "Path Param Division API",
            notes = "Divide the first number by the second number.",
            response = PathParamResult.class)
    public PathParamResult pathParamDivision(@PathParam("op1") double op1, @PathParam("op2") double op2) {
        double result = op1 / op2;
        PathParamResult pathParamResult = new PathParamResult();
        pathParamResult.setResult(Double.toString(result));
        return pathParamResult;
    }

}
