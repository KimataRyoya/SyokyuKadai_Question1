package org.example;

import java.util.Scanner;

public class Main {
  // Javaの基本構文を使用して、簡単な計算機プログラムを作成してください。
  // 加減乗除の四則演算ができ、ユーザーから入力を受け取り、結果を表示するものとします。

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("四則演算プログラム");

    try {
      // ユーザーからの入力を受け取る
      System.out.print("1つ目の数値を入力してください: ");
      double num1 = scanner.nextDouble();

      System.out.print("演算子を入力してください (+, -, *, /): ");
      char operator = scanner.next().charAt(0);

      System.out.print("2つ目の数値を入力してください: ");
      double num2 = scanner.nextDouble();

      // 演算を実行して結果を計算
      double result;
      switch (operator) {
        case '+':
          result = num1 + num2;
          break;
        case '-':
          result = num1 - num2;
          break;
        case '*':
          result = num1 * num2;
          break;
        case '/':
          if (num2 == 0) {
            System.out.println("エラー: 0で割ることはできません。");
            return;
          }
          result = num1 / num2;
          break;
        default:
          System.out.println("無効な演算子です。使用できる演算子: +, -, *, /");
          return;
      }

      // 結果を出力
      System.out.println("計算結果: " + result);
    } catch (Exception e) {
      System.out.println("エラー: 無効な入力です。数値を入力してください。");
    } finally {
      scanner.close();
    }
  }
}
