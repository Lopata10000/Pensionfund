import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class LogIn implements AutoCloseable {
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
    public static void Authorization()
    {
        System.out.println("Ти обрав авторизацію");
    }

    public static void Registration() throws Exception {
                String fileName = "Users.txt";
                String login;
                String password;
                BufferedWriter writer = null;
                try {
                    writer = new BufferedWriter(new FileWriter(fileName));
                    Scanner scanner = new Scanner(in);
                    out.println("Вибери логін");
                    login = scanner.nextLine();
                    out.println("Вибери пароль");
                    password = scanner.nextLine();
                    writer.append("\n" + password);
                    writer.append("\n" + login);
                }
                    finally {
                    if (writer != null) {
                        try {
                            writer.close();
                        }
                        catch (Exception exception)
                        {
                            out.println("Пусто");
                        }
                    }
                }
            }

    @Override
    public void close() throws Exception {

    }
}

