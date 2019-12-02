package Programs;

class StaticKeyW {
    static int m, n =1;
    int i = 2;
    public   void method() {
        for (n = 1; n < 5; n++) {
            m = n + i;

            System.out.print("num is" + m);

        }
    }

// class StaticKeyW1 extends StaticKeyW {
//
//    public static void method() {
//        n = 1;
//        m = n + 1;
//
//    }
    void method2(){
        i = 4;
        n=2;


        m = n;
        System.out.print(" actual num is " +m );

        System.out.print(" " +"i value is" +i);

    }

    public static void main(String args[]) {
StaticKeyW k = new StaticKeyW();
        k.method2();
k.method();



//        n++;

    }
}
