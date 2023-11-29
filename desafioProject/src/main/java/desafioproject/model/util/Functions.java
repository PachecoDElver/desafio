package desafioproject.model.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Functions {

	public static ResponseEntity<HttpResponse> httpResponse(HttpStatus httpstatus, String mensaje) {
		return new ResponseEntity<>(new HttpResponse(httpstatus.value(),httpstatus,
				httpstatus.getReasonPhrase(),mensaje), httpstatus);
	}
	
	public static boolean validaPattern(String valor, Pattern pattern) {
		Matcher m = pattern.matcher(valor);
		return m.matches();
	}
}
