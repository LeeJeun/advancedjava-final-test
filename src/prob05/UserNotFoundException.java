package prob05;

public class UserNotFoundException extends Exception {
	public UserNotFoundException() {
		super("아이디가 없습니다.");
	}
	
	public UserNotFoundException(String message) {
		super(message);
	}
}
