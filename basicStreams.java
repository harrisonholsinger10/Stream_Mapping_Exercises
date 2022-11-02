package com.example.demo;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class basicStreams
{
    public static void printOddNumbersInList(List<Integer> numbers)
    {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

    public static void printAllCourses(List<String> courses)
    {
        courses.stream()
                .forEach(System.out::println);
    }

    public static void printCoursesWSpring(List<String> courses)
    {
        courses.stream()
                .filter(course -> course.toLowerCase().contains("spring"))
                .forEach(System.out::println);
    }

    public static void printCourses4Letters(List<String> courses)
    {
        courses.stream()
                .filter(course -> course.length() <= 4)
                .forEach(System.out::println);
    }

    public static void printCubesOfOddNumbers(List<Integer> numbers)
    {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    public static void printNumOfCharsInEachCourse(List<String> courses)
    {
       courses.stream()
               .map(course -> course.length())
               .forEach(System.out::println);
    }

    public static int printSumOfSquares(List<Integer> numbers)
    {
        return numbers.stream()
                .map(number -> number * number)
                .reduce(0, Integer::sum);
    }

    public static int printSumOfCubes(List<Integer> numbers)
    {
        return numbers.stream()
                .map(number -> number * number * number)
                .reduce(0, Integer::sum);
    }

    public static int sumOfOddNums(List<Integer> numbers)
    {
        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce(0, Integer::sum);
    }

    public static List<Integer> printListOfEvenNums(List<Integer> numbers)
    {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> printListOfLengths(List<String> courses)
    {
        return courses.stream()
                .map(course -> course.length())
                .collect(Collectors.toList());
    }

    public static void printFunctionalInterface(List<Integer> numbers)
    {
        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;

        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>()
        {
            @Override
            public Integer apply(Integer a, Integer b)
            {
                return a * b;
            }
        };
        System.out.println(sumBinaryOperator2);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
    }

    public static List<Integer> printCubesOfOddNumbersSorted(List<Integer> numbers)
    {
        return
        numbers.stream()
                .filter(number -> number >= 3)
                .map(number -> number * number * number)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }
}
