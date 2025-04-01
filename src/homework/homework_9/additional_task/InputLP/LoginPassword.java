package homework.homework_9.additional_task.InputLP;

import java.util.Scanner;

public class LoginPassword {
    public static void test(){
        if(inputLoginPasswordConfirm()){
            System.out.println("Все данные введены правильно!");
        }else {
            System.out.println("Что-то не так!");
        }
    }

    private static boolean inputLoginPasswordConfirm(){
        boolean loginIsCorrect = false;
        boolean passwordIsCorrect = false;

        System.out.print("Длина login должна быть меньше 20 символов и не должен содержать пробелы.\n" +
                "Введите login: ");
        String login = input().nextLine();

        try {
            loginIsCorrect = checkLogin(login);
        }catch (WrongLoginException e) {
            System.out.println("Ошибка: " + e);
        }

        System.out.print(
                "Длина password должна быть меньше 20 символов, " +
                        "не должен содержать пробелом и должен содержать хотя бы одну цифру.\n" +
                "Введите password: ");
        String password = input().nextLine();
        try {
            passwordIsCorrect = checkPassword(password);
        }catch (WrongPasswordException e) {
            System.out.println("Ошибка: " + e);
        }

        System.out.print("Повторите пароль: ");
        String cPassword = input().nextLine();

        if((checkConfirmPassword(password, cPassword)) && loginIsCorrect && passwordIsCorrect){
            return true;
        }

        return false;
    }
    private static boolean checkConfirmPassword(String password, String cPassword){
        if(password.equals(cPassword)){
            return true;
        }
        return false;
    }
    private static boolean checkPassword(String password) throws WrongPasswordException{
        if((password.length() >= 20) || (password.contains(" ")) || (!checkNumInPassword(password))){
            throw new WrongPasswordException();
        }
        return true;
    }
    private static boolean checkNumInPassword(String password){
        for (int i = 0; i < 10; i++){
            char ch = (char) (i + '0');
            if(password.contains(Character.toString(ch))){
                return true;
            }
        }
        return false;
    }
    private static boolean checkLogin(String login) throws WrongLoginException{
        if((login.length() >= 20) || (login.contains(" "))){
            throw new WrongLoginException();
        }
        return true;
    }
    private static Scanner input(){return new Scanner(System.in);}


}
