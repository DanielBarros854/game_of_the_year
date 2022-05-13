package Functions;

import java.io.IOException;
import java.util.Scanner;

import Entities.Hero;
import Utils.ClearWindow;

public class SelectMenu {
  public static void main(Scanner s, String name) throws IOException, InterruptedException {
    int menu = 0;
    do {
      ClearWindow.main();
      Hero player = new Hero(name, 100, 3);

      Menu.getMenu();
      String selected = s.next();

      switch (selected) {
        case "1":
          ClearWindow.main();
          System.out.println("Iniciando!!!");
          System.in.read();
          break;

        case "2":
          ClearWindow.main();
          System.out.println("Config!!!");
          System.in.read();
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
  }
}
