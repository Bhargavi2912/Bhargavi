package Programs;

public class fibpractice {
   static int n=0, n1=1, n2;

    public static void main(String args[]){
        System.out.print(n +""+n1);
        for(int i=0; i<6; i++){
            n2 = n +n1;
          System.out.print(n2);
            n=n1;
            n1 =n2;
        }

    }


}
