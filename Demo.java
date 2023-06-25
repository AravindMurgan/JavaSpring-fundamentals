// // class Calculator {

// //     public int add(int n1, int n2) {

// //         return n1 + n2;
// //     }
// // }

// import tools.Calc;

public class Demo {

    public static void main(String a[]) {
        Computer obj = new Laptop();
        Computer obj2 = new Desktop();
        obj2.code();

    }
}

interface Computer {
    void code();
}

class Laptop implements Computer {

    public void code() {
        System.out.println("COoodeeee ,rrrrrruuuun ,coooomoppppileeee");
    }
}

class Desktop implements Computer {

    public void code() {
        System.out.println("COoodeeee ,rrrrrruuuun ,coooomoppppileeee,Fasteeeerrr");
    }
}

// abstract class A {

// public abstract void show();
// }
// class A {
// public A() {
// System.out.println("In A");
// }

// public A(int num) {
// System.out.println("A wiiith num");
// }
// }

// class B extends A {

// public B() {
// System.out.println("In B");
// }
// }

// class Mobile {

// StringBuilder brand;
// String name;
// int price;

// static {
// brand = "Apple";
// name = "Iphone-14";
// price = 20000;
// }

// public void show() {
// System.out.println(brand + " " + price);
// }
// }

// class Human {
// private String name;
// private int age;

// public Human() {
// System.out.println("In Constructor");
// }

// public String getName() {
// return name;
// }

// public void setName(String name) {
// this.name = name;
// System.out.println(this.name);
// }

// public int getAge() {
// return age;
// }

// public void setAge(int age) {
// this.age = age;
// }

// }