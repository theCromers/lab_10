import java.util.Scanner;
public class Lab10_Q3 {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("your input is: "+line);
        System.out.println("please enter a word: ");
        char[] word=sc.nextLine().toCharArray();
        System.out.println(word.length);
        swapPairs(word);
    }
    public static String swapPairs(char[] word) {
        for(int i= 0; i< word.length; i+=2) {
            if(i+1<word.length&&!(word[i+1]==' ')) {
                char temp1=word[i];
                word[i]=word[i+1];
                word[i+1]=temp1;
            }
        }
        System.out.println(word.length);
        for(int j= 0; j<word.length; j++) {
            System.out.print(word[j]+ " ");

        }
        return"";
    }
}