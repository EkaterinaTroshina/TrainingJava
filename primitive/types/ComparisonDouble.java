package primitive.types;

import java.util.Scanner;

public class ComparisonDouble {

  public static void main(String[] args) {
    System.out.println("Операции над double/float\n" + "1. Сравнить\n" + "2. Округлить\n"
        + "3. Отбросить дробную часть\n" + "Укажите 1, 2 или 3");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    switch (x) {
      case 1: {
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        float b = scanner.nextFloat();
        compare(a, b);
      }
      break;
      case 2: {
        System.out.println("Введите число:");
        float a = scanner.nextFloat();
        System.out.println("Результат:\n" + "Округленное значение: " + Math.round(a));
      }
      break;
      case 3: {
        System.out.println("Введите число:");
        float a = scanner.nextFloat();
        System.out.println("Результат:\n" + "Число без дробной части: " + (long) a);
      }
      break;
      default:
        System.out.println("Необходимо указать 1, 2 или 3");
    }
  }

  public static void compare(double a, float b) {
    if (Math.abs(a - b) < 0.0000001) {
      System.out.println("Результат:\n" + "числа равны");
    } else if (a > b) {
      System.out.println("Результат:\n" + "числа не равны. Больше первое число: " + a);
    } else {
      System.out.println("Результат:\n" + "числа не равны. Больше второе число: " + b);
    }
  }
}

