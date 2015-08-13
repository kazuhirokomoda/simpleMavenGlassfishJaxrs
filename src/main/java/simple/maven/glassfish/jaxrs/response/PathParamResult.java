
package simple.maven.glassfish.jaxrs.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "path param result")
public class PathParamResult {

    @ApiModelProperty(value = "result", required=true)
    private String result;

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }
}
