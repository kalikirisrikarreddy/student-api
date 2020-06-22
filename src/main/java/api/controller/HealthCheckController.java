package api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import api.model.Status;

@RestController
public class HealthCheckController {

  @GetMapping("/api/v1/health")
  public ResponseEntity<Status> getHealthStatus() {
    Status status = new Status();
    status.setStatus("i am absolutely alright");
    return new ResponseEntity<>(status, HttpStatus.OK);
  }

}
