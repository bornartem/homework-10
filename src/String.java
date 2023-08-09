import java.util.Arrays;
import java.util.Locale;

public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String firstName = "Ivan"; // Задача 1 - Почему при написании String java выделяет красным и просит переделать на  java.lang.String firstName?
        java.lang.String middleName = "Ivanovich";
        java.lang.String lastName = "Ivanov";
        java.lang.String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        java.lang.String small = fullName; // Задача 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + small.toUpperCase(Locale.forLanguageTag(fullName))); //Почему при написании в скобках fullName java выделяет красным и  просит добавить "Locale.forLanguageTag"?

        java.lang.String firstName1 = "Семён"; // Задача 3
        firstName1 = firstName1.replace("ё","е");
        java.lang.String middleName1 = "Семёнович";
        middleName1 = middleName1.replace("ё","е");
        java.lang.String lastName1 = "Иванов";
        java.lang.String fullName1 = lastName1 + " " + firstName1 + " " + middleName1;
        System.out.println("Данные ФИО сотрудника — " + fullName1);

    }
}