import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jugadas = in.nextLine();
        if(jugadas.contains("0000000") || jugadas.contains("1111111")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
