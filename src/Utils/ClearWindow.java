package Utils;
import java.io.IOException;
import java.util.Scanner;

public class ClearWindow {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teste");
        String texto = scanner.next();

        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

    }
}
