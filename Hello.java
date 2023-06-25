class A {

    public void showHere() {
        System.out.println("In Show A");
    }
}

class B extends A {

    @Override
    public void showHere() {
        System.out.println("In Show B");
    }
}

class Hello {
    public static void main(String a[]) {
        B obj = new B();
        obj.showHere();
    }
}