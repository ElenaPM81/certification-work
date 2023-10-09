
import java.io.FileWriter;
import java.util.Scanner;
public  class Main {
    public static void main(String[] args)  {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите через пробел ФИО дата рождения в формате dd, mm, yyyy, номер телефона, пол :");
            String inputData = scanner.nextLine();

            //проверяем является ли строка пустой
            if (inputData.isEmpty()) {
                 new IOException();
                System.out.println("Вы ввели пустую строку!");

                return;
            }

            //разделяем введенные данные по пробелу
            String[] parts = inputData.split(" ");
//       проверяем количество введенных данных
            if (parts.length != 6) {
                new IOException();

                System.out.println("Проверьте введенные данные");
                return;
            }

   String F = parts[0];
   String I = parts[1];
   String O = parts[2];
   String data = parts[3];
   String pfone = parts[4];
   String gender = parts[5];

//        Проверяем форматы данных
                if (!data.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                    new IOException();
                    System.out.println("Проверьте дату рождения.");
               return;
                }
                if (!pfone.matches("\\d{11}")) {
                    new IOException();
                    System.out.println("Проверьте номер телефона");
                return;
                }
                if (!gender.matches("f") && (!gender.matches("m"))) {
                    System.out.println("Проверьте формат пола");
                    scanner.nextLine();
                return;
                }
//            формируем строку для записи в файл
                String dataString = F + " " + I + " " + O + " " + data + " " + pfone + " " + gender;
//            записываем данные в файл
                try {
                    FileWriter fileWriter = new FileWriter(F + ".txt", true);
                    fileWriter.write(dataString + System.lineSeparator());
                    fileWriter.close();
                    System.out.println("Данные записаны в файл " + F + ".txt");

                } catch (Exception e) {
                    System.out.println("Ошибка при записи в файл.");
                    e.printStackTrace();
                }
        }
        }

    }
















