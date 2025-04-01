package homework.homework_9.additional_task.InputLP;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }
    public WrongLoginException(){
      super("Некорректный логин!");
    }
}
