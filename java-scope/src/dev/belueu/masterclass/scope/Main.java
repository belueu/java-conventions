package dev.belueu.masterclass.scope;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String valFour = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("valThree is not accessible hele " + innerClass.valThree);


        System.out.println("scopeInstance valOne is " + scopeInstance.getValOne());
        System.out.println(valFour);

        scopeInstance.timesTwo();

        System.out.println("******************************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}