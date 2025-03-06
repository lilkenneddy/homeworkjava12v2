package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Пошук елемента за значенням
        // Зчитати з клавіатури розмір масиву n.
        // Створити масив цілих чисел і заповнити його даними користувача.
        // Запитати у користувача, яке число треба знайти.
        // Перевірити, чи це число є в масиві (за допомогою циклу).
        // Вивести, на яких індексах (одному чи декількох) міститься шукане число, або повідомлення
        // що такого числа в масиві немає.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір масиву");

        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Заповніть масив елементами");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Масив має вигляд ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Яке число треба знайти?");
        int numberToFind = scanner.nextInt();

        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                position = i;


            }
        }
        if (position != -1) {
            System.out.println("Шуканий елемент знаходиться під індексом" + position);
        } else {
            System.out.println("Шуканий елемент не знайдено :(");
        }

    }
}