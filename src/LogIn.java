import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class LogIn {
    static final String userData = "Users.txt";
    static Scanner scanner = new Scanner(in);
    static String newLogin;
    static String newPassword;
    static  String login;
    static String password;
    boolean checkData;
    public static void authorization()
    {
        out.println("Ваш логін:");
        login = scanner.nextLine();
        out.println("Ваш пароль");
        password = scanner.nextLine();
        try( FileReader reader= new FileReader(userData))
        {
            Scanner scan = new Scanner(reader);

            if (Files.lines(Paths.get(userData), StandardCharsets.UTF_8).anyMatch(login::equals)&&Files.lines(Paths.get(userData), StandardCharsets.UTF_8).anyMatch(password::equals))
            {
                out.println("Такий акаунт знайдено");
            }
            else {
                out.println("Такого акаунту немає");
            }

            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void registration() throws IOException {

                try(BufferedWriter writer = new BufferedWriter(new FileWriter(userData))) {
                    out.println("Вибери логін");
                    newLogin = scanner.nextLine();
                    out.println("Вибери пароль");
                    newPassword = scanner.nextLine();
                    writer.append("\n" + newPassword);
                    writer.append("\n" + newPassword);
                    writer.close();
                    out.println("Успішно");

                }
                        catch (Exception exception)
                        {
                            out.println("Пусто");
                        }
                    }
                }

