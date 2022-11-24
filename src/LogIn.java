import java.io.*;
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

            if ( check == Files.lines(Paths.get(FILE_NAME.txt), StandardCharsets.UTF_8).anyMatch("c4ca4238a0b923820dcc509a6f75849b"::equals);)

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

