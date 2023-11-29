package desafioproject.model.exception.domain;

public class NotAcceptable extends Exception{

	private static final long serialVersionUID = 8397551555745330137L;

	public NotAcceptable(String message) {
		super(message);
	}
}
