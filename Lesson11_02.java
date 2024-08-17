public class Lesson11_02 {
    public static void main(String[] args) {

        try {
            calcTest();
        } catch (ArithmeticException e) {
            System.out.println("0で除算はできません。");
        }
        System.out.println("処理終了");
    }

    static void calcTest() {
        int num = 10 / 0;
        // 結果を表示
        System.out.println("10/0 の結果は" + num);
    }
}
