public class task1 {
    /*
    1- Bir Java programı yazınız. Bu program, sabit bir sayının karesini ve küpünü hesaplayarak ekrana yazdıracaktır.
    Programın aşağıdaki adımları takip etmesi gerekmektedir:

            1. Sabit bir sayıyı tanımlayınız (örneğin, `int sayi = 4;`).
            2. Bu sayının karesini hesaplayınız.
            3. Bu sayının küpünü hesaplayınız.
            4. Sonuçları ekrana yazdırınız.

     */
    public static void main(String[] args) {
        int a = 4;
        int square = a*a;
        int cube = a*a*a;

        System.out.println( a + " sayısının karesi: " + square);
        System.out.println( a + " sayısının kübü: " + cube);
    }

}
