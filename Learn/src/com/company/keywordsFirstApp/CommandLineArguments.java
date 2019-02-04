package com.company.keywordsFirstApp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommandLineArguments {

    public static void main(String[] args) {
        argumentsReverse(args);
        int argumentsSum = argumentsSum(args);
        System.out.println(argumentsSum);

        //6. Вывести фамилию разработчика, дату и время получения задания, а также дату и время сдачи задания.
        System.out.println("Kate Arzhanova");

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -2);
        System.out.println("Got a task " + dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DATE, +20);
        System.out.println("Deadline " + dateFormat.format(calendar.getTime()));

       }

    // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void argumentsReverse (String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }

    // 5. Ввести целые числа как аргументы командной строки, подсчитать их суммы
    // (произведения) и вывести результат на консоль.
    public static int argumentsSum(String[] args) {
        int sum = 0;

        Integer[] intArray = new Integer[args.length];
        int i = 0;
        for (String argument : args) {
            intArray [i] = Integer.parseInt(argument.trim());
            sum = sum + intArray[i];
            i++;
        }
        return sum;
    }



}
