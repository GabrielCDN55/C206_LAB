//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(fatorial(5));
        mostraPares(23);
    }

    public static void mostraPares(int n){
        int i;
        int y;
        for(i = 0; i < n; i++) {
            y = i % 2;
            if (y == 0) {
                System.out.println(i);
            }
        }
    }

    public static int fatorial(int n){

        if (n <= 1) {
            return 1;
        } else {
            return fatorial(n - 1) * n;
        }
    }
}