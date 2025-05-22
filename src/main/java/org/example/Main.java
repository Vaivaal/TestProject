package org.example;

import com.testService.AbstractImplementation;
import com.testService.EnumTest;
import com.testService.MethodClass;
import com.testService.anotherPackage.AnotherClass;
import org.anotherTestService.DifferentPackageClass;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MethodClass methodClass = new MethodClass();
        System.out.println(methodClass.getHelloWorld());
        MethodClass.publicStaticMethod("string");

        GetEnum getEnum = new GetEnum();
        doSomething(getEnum);

        SomeClass someClass = new SomeClass();
        System.out.println(someClass.implementableMethod());

        AbstractImplementation abstractImplementation = new AbstractImplementation();
        abstractImplementation.mustBeOverridden();
        abstractImplementation.useBase();
        abstractImplementation.useBase(1);

        System.out.println(MethodClass.publicStaticMethod("hello"));

//        ExtendableClass extendableClass = new ExtendableClass();
//        String emoji = extendableClass.getEmoji();
//        System.out.println(emoji);

        ClassThatExtends classThatExtends = new ClassThatExtends();
        classThatExtends.start();
        classThatExtends.doSomething();

        AnotherClass anotherClass = new AnotherClass();
        System.out.println(anotherClass.anotherMethod());

        DifferentPackageClass differentPackageClass = new DifferentPackageClass();
        differentPackageClass.differentPackageMethod();

        List<String> words = Arrays.asList("hello", "world");
        List<String> big = words.stream()
                .map(word -> MethodClass.transformToUpper(word))
                .toList();

        methodClass.printList(big);

    }

    private static void doSomething(GetEnum getEnum){
        int number = getEnum.enumTestExample().TESTING1.getNumber();
        System.out.println(number);
        System.out.println(EnumTest.TESTING2.implementableMethod());
        //System.out.println(enumTest.getNumber());
    }
}