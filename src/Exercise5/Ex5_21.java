package Exercise5;
/*  Program created by Uchechi
    Date:   09/10/2020
    
*/


public class Ex5_21 {
    public Ex5_21() {

    }

    public void triangles() {
        System.out.printf("%4s %4s %4s \n", "a", "b", "c");

        for (int a = 1; a <= 500; ++a) {
            for (int b = 1; b <= 500; ++b) {
                for (int c = 1; c <= 500; ++c) {
                    if (a * a + b * b == c * c) {
                        System.out.printf("%4d %4d %4d \n", a, b, c);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Ex5_21 t = new Ex5_21();
        t.triangles();
    }
}