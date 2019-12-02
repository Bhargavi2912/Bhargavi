package Programs;

public class AmstrongNumber{
    static int  num = 371, exp =0, remainder;
    static int original = 371;
    void amstrong(){

        while(num!=0){
           remainder = num%10;
            exp = exp + remainder*remainder*remainder;
            num = num/10;

        }
        if(original == exp){
            System.out.print("num is "+exp);
        }
        else {
            System.out.print("num is not amstrong");
        }

    }
    public static void main(String args[]){
        AmstrongNumber a = new AmstrongNumber();
        a.amstrong();


    }
}