package org.example;

import com.testService.ExtendableClass;

public class ClassThatExtends extends ExtendableClass {
    @Override
    public void doSomething() {
        System.out.println("Overridden in project :)");
    }
}
