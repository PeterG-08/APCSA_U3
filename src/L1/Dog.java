package L1;

public class Dog {
    public static void main(String[] args) {
        /* NOTE! When you create a new object with the new
   operator, it’s a different object in memory from
   any other objects already created -- even if
   instance variables happen to be the same */

        int a = 15;
        int b = 15;
        int c = 20;
        System.out.println("-- Set A --");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        System.out.println("-- Set B --");
        System.out.println(a > c);
        System.out.println(a < c);
        System.out.println(a >= c);
        System.out.println(a <= c);
    }

    private String name;
    private int age;
    private boolean isSleeping;

    public Dog(String n, int a, boolean i) {
        name = n;
        age = a;
        isSleeping = i;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsSleeping() {
        return isSleeping;
    }

    public String toString() {
        return name + " goes woof woof!!!";
    }
}


