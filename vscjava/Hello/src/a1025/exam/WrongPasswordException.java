package a1025.exam;

public class WrongPasswordException extends Exception {
  public WrongPasswordException() {}
  public WrongPasswordException(String message) {
    super(message);
  }
}
