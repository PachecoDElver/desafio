package desafioproject.model.exception.domain;

public class InternalServerError extends Exception{
	private static final long serialVersionUID = 6421151440984272555L;

	public InternalServerError(String message) {
        super(message);
    }
}
