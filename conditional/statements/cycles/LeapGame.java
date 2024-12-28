package conditional.statements.cycles;

import java.util.Scanner;

public class LeapGame {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int main = 0;
    int actualDay;
    int expectedDay;
    while (true) {
      System.out.println("Введите год в формате: yyyy количество-дней");
      int year = scanner.nextInt();
      actualDay = scanner.nextInt();
      expectedDay = getDay(year);
      if (actualDay != expectedDay) {
        break;
      }
      main++;
    }
    System.out.println("Неправильно! В этом году " + expectedDay + " дней!");
    System.out.println("Набрано очков: " + main);
  }

  public static int getDay(int year) {
    int days;
    if (year % 400 == 0) {
      days = 366;
    } else if ((year % 4 == 0) & !(year % 100 == 0)) {
      days = 366;
    } else {
      days = 365;
    }
    return days;
  }
}
