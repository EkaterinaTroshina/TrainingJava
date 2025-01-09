package primitive.types;

import java.util.Scanner;

public class Ip {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int earnings = 0;
    int spending = 0;

    while (true) {
      System.out.println("\nВыберите операцию и введите её номер:\n1. Добавить новый доход\n2. Добавить новый расход\n3. Выбрать ситему налогообложения");
      String input = scanner.nextLine();
      if ("end".equals(input)) {
        break;
      } else {
        int operation = Integer.parseInt(input);
        switch (operation) {
          case 1:
            System.out.println("Введите сумму дохода:");
            String moneyStr = scanner.nextLine();
            int money = Integer.parseInt(moneyStr);
            earnings += money;
            break;
          case 2:
            System.out.println("Введите сумму расхода:");
            String moneySpanStr = scanner.nextLine();
            int moneySpan = Integer.parseInt(moneySpanStr);
            spending += moneySpan;
            break;
          case 3:
            getInfo (earnings, spending);
            break;
          default:
            System.out.println("Такой операции нет");
        }
      }
    }
    System.out.println("Программа завершена!");
  }

  public static int taxEarningsMinusSpending(int earnings, int spending) {
    int tax = (earnings - spending) * 15 / 100;
    if (tax >= 0) {
      return tax;
    } else {
      return 0;
    }
  }

  public static int taxEarnings(int earnings) {
    return earnings * 6 / 100;
  }

  public static void getInfo(int earnings, int spending) {
    int usnEarningsMinusSpending = taxEarningsMinusSpending(earnings, spending);
    int usnEarnings = taxEarnings(earnings);
    int benefit = Math.abs(usnEarningsMinusSpending - usnEarnings);
    if (usnEarnings < usnEarningsMinusSpending) {
      System.out.println("\nМы советуем вам УСН доходы\nВаш налог составит: " + usnEarnings
          + " рублей\nНалог на другой системе: " + usnEarningsMinusSpending + " рублей\nЭкономия: "
          + benefit + " рублей");
    } else if (usnEarningsMinusSpending < usnEarnings) {
      System.out.println("\nМы советуем вам УСН доходы минус расходы\nВаш налог составит: "
          + usnEarningsMinusSpending
          + " рублей\nНалог на другой системе: " + usnEarnings + " рублей\nЭкономия: "
          + benefit + " рублей");
    } else {
      System.out.println(
          "\nСистема не может определиться с выбором. Можете выбрать любую из двух систем: УСН доходы или УСН доходы минус расходы\n Ваш налог в любой из систем составит: "
              + usnEarnings + " рублей\n");
    }
  }
}
