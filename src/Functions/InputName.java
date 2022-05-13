package Functions;

import java.io.IOException;
import java.util.Scanner;

import Utils.ClearWindow;

public class InputName {
  public static String main(Scanner s) throws IOException, InterruptedException {
    String name;
		boolean nameIsValid = false;
    do {
			ClearWindow.main();
			System.out.println("Qual seu nome nobre guerreiro(a)?");
			name = s.next();

			if (name != "") {
				nameIsValid = true;
			}

		} while (nameIsValid == false);
    return name;
  }
}
