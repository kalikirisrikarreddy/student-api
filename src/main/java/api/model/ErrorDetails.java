package api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class ErrorDetails {

  @JsonProperty("error_code")
  private String code;
  @JsonProperty("error_description")
  private String description;

  public String getCode() {
    return code;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }


  public ErrorDetails() {}

  public ErrorDetails(String code, String description) {
    this.code = code;
    this.description = description;
  }


}
