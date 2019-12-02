package Programs;

public class PalindromeS {
    String str = "madam";
    char[] ch = str.toCharArray();
    String rev ="";
    void palindrome(){
        for(int i = ch.length-1; i<=0; i--){
            rev = rev + ch[i] ;
        }
        if(rev == str);
        {
            System.out.print("Palindrome");
        }

        }
    public static void main(String[] args){
        PalindromeS  ps = new PalindromeS();
        ps.palindrome();

    }

}
