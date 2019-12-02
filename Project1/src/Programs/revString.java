package Programs;

public class revString {
    int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int s = a.length;
 int array[] =new int[5];

    void length123() {

        System.out.print(s);
    }

    void revString1() {
        for (int i = a.length - 1; i <= 0; i--) {
            int max = a[i];
            for (int j = 0; j < a.length; j++) {
                if (max > a[j]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    for (i = 0; i < a.length; i++) {
                        System.out.print("elemts are" + " " + i + a[i]);
                    }
                }
            }
        }

    }


        public static void main (String[] args) {
            revString b = new revString();
            b.revString1();
            b.length123();

        }
    }


