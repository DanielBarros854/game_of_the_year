import java.util.Scanner;

import Entities.Enemy;
import Entities.Hero;
import Utils.ClearWindow;

class Main {
	public static void main(String[] args) {
		Hero player1 = new Hero("Felipe", 100, 2);
		Enemy Goblin = new Enemy("Goblin", 2, 20);

		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu nome nobre guerreiro(a)?");
		String nome = s.next();
		new ClearWindow();

		System.out.println("nome: " + nome);

		s.close();
	}
}
