package HW3.Task1;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class PasswordVerifier {

    public static boolean CheckerPassword(String str)
            throws NumberOfCharactersIsLess,NoNumbers, NoCapitalLetters{
        if (str.length()>=8){
            int count=0;
            int count1=0;
            for (int i=0; i<str.length();i++){
                if (isUpperCase(str.charAt(i))){
                    count++;}
                if (Character.isDigit(str.charAt(i))) {
                    count1++;
                    }}
            if (count==0) {
                throw new NoCapitalLetters("Ошибка!Должна быть хотя бы одна заглавная буква ");}
            if (count1==0) {
                throw new NoNumbers("Ошибка!Нет цифр");}}
        else {
            throw new NumberOfCharactersIsLess("Ошибка!Кол-во символов должно быть неменее 8");
        }
       return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите пароль");
        String password = sc.nextLine();
        try {
            CheckerPassword(password);
            System.out.println("Пароль успешно создан");
        }
        catch (NumberOfCharactersIsLess|NoNumbers|NoCapitalLetters exception)
        {System.out.println(exception.getMessage());}

    sc.close();
    }


}
