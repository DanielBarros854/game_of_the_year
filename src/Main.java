import java.io.IOException;
import java.util.Scanner;

import Entities.Hero;
import Functions.InputName;
import Functions.Menu;
import Utils.ClearWindow;

class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		int menu = 0;
		Scanner s = new Scanner(System.in);

		String name = InputName.main(s);

		do {
			ClearWindow.main();
			Hero player = new Hero(name, 100, 3);

			Menu.getMenu();
			String selected = s.next();

			switch (selected) {
				case "1":
					System.out.println("Iniciando!!!");
					break;

				case "2":
					System.out.println("Config!!!");
					break;

				case "3":
					ClearWindow.main();
					player.gerPeopleInfo();
					System.in.read();
					break;

				case "4":
					menu = 1;
					break;

				default:
					ClearWindow.main();
					System.out.println("Informe uma opção valida!!!");
					System.in.read();
					ClearWindow.main();
					break;
			}

		} while (menu == 0);

		s.close();
	}
}
