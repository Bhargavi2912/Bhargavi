package Programs;

public class Overloading {

    String method(String str) {
        str = "abc";
        return str;
    }

    String method() {
        String s = "123";
        System.out.println("123");
        return s;
    }
public static void main(String[] args){
        Overloading o = new Overloading();
        o.method();
}

}
