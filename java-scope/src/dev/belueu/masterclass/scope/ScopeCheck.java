package dev.belueu.masterclass.scope;

public class ScopeCheck {

    public int publicVal = 0;
    private int valOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVal = " + publicVal + ", privateVal = " + valOne);
    }

    public int getValOne() {
        return valOne;
    }

    public void timesTwo() {
        int valTwo = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * valTwo);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("valThree from outer class: " + innerClass.valThree);
    }

    public class InnerClass {
        private int valThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, valOne is " + valOne + ", valThree is " + valThree);
        }

        public void timesTwo() {
            System.out.println("valOne is still available here " + valOne);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * valThree);
            }
        }
    }
}
