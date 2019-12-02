package Programs1;

public class SwappingwithoutTemp {
    int i =9, j=23;
    int temp;
    void swap(){

//        i = i+j;
//        j = i-j;
//        i = i-j;

        temp = i;
        i = j;
        j= temp;

    System.out.print("values are" +i +" " +j);
    }
    public static void main(String args[]){

        SwappingwithoutTemp s = new SwappingwithoutTemp();
        s.swap();
    }
}
