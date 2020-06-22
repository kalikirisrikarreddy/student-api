package api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ErrorResponse {

  @JsonProperty("errors")
  private final List<ErrorDetails> errors = new ArrayList<>();

  public List<ErrorDetails> getErrors() {
    return errors;
  }

  public ErrorResponse(final ErrorDetails errorDetails) {
    this.errors.add(errorDetails);
  }

  public ErrorResponse(final List<ErrorDetails> errors) {
    this.errors.addAll(errors);
  }

public ErrorResponse() {
}
  
  

}
