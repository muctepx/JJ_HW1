package ru.geekbrains.lesson1.HW;

    /* Напишите программу, которая использует Stream API для обработки списка чисел.
     *  Программа должна вывести на экран среднее значение всех четных чисел в списке. */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static ru.geekbrains.lesson1.HW.Tools.getAverageEvenNumbers;
import static ru.geekbrains.lesson1.HW.Tools.printlnList;

public class Main {
        public static void main(String[] args) {
            // Генерация массива
            Random rnd = new Random();
            List<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 6; i++) numberList.add(rnd.nextInt(10));

            //Вывод исходного массива
            System.out.print("Исходный массив: ");
            printlnList(numberList);

            //Вывод четных чисел (для контроля)
            System.out.print("Четные числа массива (для наглядности): ");
            printlnList(numberList.stream()
                    .filter(i -> i % 2 == 0)
                    .collect(Collectors.toList()));

            //Подсчет среднего четных чисел
            System.out.println("Среднее арифметическое четных чисел: " + getAverageEvenNumbers(numberList));

        }

    }
