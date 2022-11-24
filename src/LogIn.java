import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class LogIn {
//    public static void Registration() throws IOException {
//        String fileName = "Users.txt";
//        String login;
//        String password;
//        BufferedWriter writer = null;
//        try {
//            writer = new BufferedWriter(new FileWriter(fileName));
//            Scanner scanner = new Scanner(in);
//            out.println("Вибери логін");
//            login = scanner.nextLine();
//            out.println("Вибери пароль");
//            password = scanner.nextLine();
//            writer.append("\n" + password);
//            writer.append("\n" + login);
//        } finally {
//            if (writer != null) {
//                writer.close();
//            }
//
//        }
//    }
    public static void authorization()
    {
        System.out.println("Ти обрав авторизацію");
    }

    public static void registration() {
                String fileName = "Users.txt";
                Scanner scanner = new Scanner(in);
                String login;
                String password;

                try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                    out.println("Вибери логін");
                    login = scanner.nextLine();
                    out.println("Вибери пароль");
                    password = scanner.nextLine();
                    writer.append("\n" + password);
                    writer.append("\n" + login);
                    out.println("Успішно");
                }
                        catch (Exception exception)
                        {
                            out.println("Пусто");
                        }
                    }
                }

