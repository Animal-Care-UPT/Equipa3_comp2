package AnimalCareCentre.server.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ACCExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<?> handleValidationErrors(MethodArgumentNotValidException e) {

    List<String> errors = new ArrayList<>();

    e.getBindingResult().getFieldErrors().forEach(err -> errors.add(err.getDefaultMessage()));

    return ResponseEntity.badRequest().body(errors);
  }

}
