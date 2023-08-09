import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan"; // Задача 1
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        String small = fullName; // Задача 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + small.toUpperCase());

        String firstName1 = "Семён"; // Задача 3
        firstName1 = firstName1.replace("ё","е");
        String middleName1 = "Семёнович";
        middleName1 = middleName1.replace("ё","е");
        String lastName1 = "Иванов";
        String fullName1 = lastName1 + " " + firstName1 + " " + middleName1;
        System.out.println("Данные ФИО сотрудника — " + fullName1);

    }
}