import java.io.IOException;
import java.util.Scanner;

import Entities.Enemy;
import Entities.Hero;
import Utils.ClearWindow;

class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		ClearWindow.main(args);

		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu nome nobre guerreiro(a)?");
		String name = s.next();
		ClearWindow.main(args);

		Hero player1 = new Hero(name, 100, 3);

		player1.gerPeopleInfo();

		s.close();
	}
}
