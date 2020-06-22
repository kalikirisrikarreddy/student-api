package api.exception;

import java.util.Arrays;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import api.model.ErrorDetails;
import api.model.ErrorResponse;

@ControllerAdvice
public class DefaultExceptionHandler {

  private static final Logger logger = LoggerFactory.getLogger(DefaultExceptionHandler.class);

  @ExceptionHandler(Exception.class)
  public final ResponseEntity<ErrorResponse> handleException(
      HttpServletResponse httpServletResponse, Exception ex) {
    logger.error("Unhandled exception while processing request ", ex);
    ErrorResponse response =
        new ErrorResponse(Arrays.asList(new ErrorDetails("ISE", "Internal Server Error")));
    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
  }

}
