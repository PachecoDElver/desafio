package desafioproject.model.util;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HttpResponse {
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy hh:mm:ss", timezone = "America/Lima")
	    private String message;

	    public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String message) {
	        this.message = message;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }
	}
