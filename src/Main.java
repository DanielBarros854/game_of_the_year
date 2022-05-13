import java.io.IOException;
import java.util.Scanner;

import Functions.InputName;
import Functions.SelectMenu;

class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner s = new Scanner(System.in);

		String name = InputName.main(s);

		SelectMenu.main(s, name);

		s.close();
	}
}
