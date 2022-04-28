package dev.belueu.masterclass.accessmodifiers;

interface Accessible {
    // public static final int SOME_CONSTANT
    // All variables in interfaces are public static final
    int SOME_CONSTANT = 100;
    public void methodA();
    // public void methodB();
    // All methods in interfaces are public if no access modifier is specified
    void methodB();
    // public boolean methodC();
    boolean methodC();
}
