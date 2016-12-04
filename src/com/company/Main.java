package com.company;


import com.company.domain.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {



    }

    // refactoring java 7 => 8

    public static void printNameAndAgeOfEveryStudent(List<Student> students) {


        students.forEach(i -> System.out.println(i.getName()));
    }


    // map - method reference
    public static List<Integer> getStudentAges(List<Student> students) {


        return students.stream().map(i -> i.getAge()).collect(Collectors.toList());



    }

    // map
    public static List<Student> getMultiplyStudentAge(List<Student> students){




        return students.stream()

                .map(i -> new Student(i.getName(), i.getAge()  * 2, i.getGender(), i.getGrades(), i.getFavouriteSubject()))
                .collect(Collectors.toList());



    }

    // filter
    public static List<Student> getStudentsWithMinimumAge(List<Student> students, int minAge) {




       return students.stream().filter(i -> i.getAge()  < minAge).collect(Collectors.toList());


    }



    public static List<Integer> getPrimeAges(List<Student> students) {


        return students.stream().map(Student::getAge).filter(Main::isPrime).collect(Collectors.toList());




    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    // comparing (sorted)
    public static List<Integer> getSortedAges(List<Student> students) {

        throw new IllegalArgumentException();
    }

    // count
    public static long countMaleStudents(List<Student> students) {



        throw new IllegalArgumentException();
    }


    // average, orElse
    public static double avgAgeOfFemaleStudent(List<Student> students){

        throw new IllegalArgumentException();
    }


    // reduce
    public static double productOfStudentGrades(Student student) {

        throw new IllegalArgumentException();
    }


    // sorted(default), findFirst
    public static Optional<Grade> getBestMathGradeFromStudent(Student student) {

        throw new IllegalArgumentException();
    }

    // anyMatch
    public static boolean atLeastOneGradeA(Student student){

        throw new IllegalArgumentException();
    }


    // limit, IntStream.iterate, boxed
    public static List<Integer> getFirstPrimes(int howMany) {

        throw new IllegalArgumentException();
    }


}
