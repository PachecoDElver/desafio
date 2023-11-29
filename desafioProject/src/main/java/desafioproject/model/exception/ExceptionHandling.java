package desafioproject.model.exception;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import static org.springframework.http.HttpStatus.NOT_ACCEPTABLE;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import desafioproject.model.exception.domain.InternalServerError;
import desafioproject.model.exception.domain.NotAcceptable;
import desafioproject.model.util.Functions;
import desafioproject.model.util.HttpResponse;


@RestControllerAdvice 
public class ExceptionHandling implements ErrorController{
	private static final String ERROR_PATH = "/error";

	@ExceptionHandler(InternalServerError.class)
	public ResponseEntity<HttpResponse> internalServerErrorException(InternalServerError exception) {
		exception.printStackTrace();
		return Functions.httpResponse(INTERNAL_SERVER_ERROR, exception.getMessage());
	}
	
	@ExceptionHandler(NotAcceptable.class)
	public ResponseEntity<HttpResponse> notAcceptable(NotAcceptable exception) {
		exception.printStackTrace();
		return Functions.httpResponse(NOT_ACCEPTABLE, exception.getMessage());
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
}
