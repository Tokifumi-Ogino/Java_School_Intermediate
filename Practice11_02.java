/* 1. 新規Java ファイル「Practice11_02.java」というファイルを作成し、
メインメソッドを書きサンプルソースを元に、実行結果の通りに表示されるようなプログラムをコーディングしてください。*/

/* 2. ランダムな 0, 1 の整数の値によって上記の例外が発生するようなプログラムをコーディングしてください。
    0 の場合、「計算例外をキャッチしました。」
    1 の場合、「ぬるぽをキャッチしました。」*/

/* 3. メソッドの呼び出し先で例外を発生させ、main メソッドでキャッチするような実装としてください。*/

/*実行結果
    計算例外をキャッチしました。 ※2. の条件参照
    ぬるぽをキャッチしました。　 ※2. の条件参照
    finally 計算終了
    処理終了
*/
import java.util.Random;

public class Practice11_02 {
    public static void main(String[] args) {
        try {
            numIdentify();

        } catch (ArithmeticException e) {
            System.out.println("計算例外をキャッチしました。");

        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");

        } finally {
            System.out.println("finally 計算終了");

        }
        System.out.println("処理終了");
    }

    static void numIdentify() {
        int num = new Random().nextInt(2);
        System.out.println("num = " + num);
        if (num == 0) {
            int result = 1 / 0;

        } else if (num == 1) {
            String str01 = null;
            System.out.println(str01.length()); 
        }

    }
}