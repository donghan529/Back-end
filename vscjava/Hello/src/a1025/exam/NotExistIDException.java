package a1025.exam;

public class NotExistIDException extends Exception {
  public NotExistIDException() {}
  public NotExistIDException(String message) {
    super(message);
  }
}
