package HW3.Task2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {public static void main(String[] args){
    String nameF1 = "text.txt";
    String nameF2 = "text2.txt";

    try {
        FileManager.readFile("text.txt");
        FileManager.writeFile("Hello ,world","text.txt");
        System.out.println("Файл успешно записан");
        FileManager.copyFile("text.txt","text2.txt");
        System.out.println("Файл успешно скопирован");
    } catch (FileNotFoundException e){
        System.out.println("ошибка файл не найден");
        e.printStackTrace();
    } catch (IOException e) {
            System.out.println("ошибка при вводе/выводе данных из файла");
            e.printStackTrace();
    }


}

}
