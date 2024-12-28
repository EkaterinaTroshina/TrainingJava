package conditional.statements.cycles;

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    System.out.println("Введите год в формате \"yyyy\"");
    Scanner scanner = new Scanner(System.in);
    int year = scanner.nextInt();
    if (year % 400 == 0) {
      System.out.println("Количество дней 366");
    } else if ((year % 4 == 0) & !(year % 100 == 0)) {
      System.out.println("Количество дней 366");
    } else {
      System.out.println("Количество дней 365");
    }
  }
}
