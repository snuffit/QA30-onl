package homework.homework_9.additional_task.InputLP;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
    }
    public WrongPasswordException(){
        super("Некорректный пароль!");
    }
}
