/*
新規Java ファイル「Practice11_01.java」というファイルを作成し、
メインメソッドを書き、
下記の通り、コーディングしてください。

NullPointerException クラスの例外処理をプログラムしてください。
ネットでぬるぽ(NullPointerException)について調べ、どのようなものか、どのように発生できるかと調査する
catch ブロック、finally ブロックを用いて、以下の実行結果が出力されるようコーディングしてください。
*/

/*
実行結果

ぬるぽをキャッチしました。
finally ブロックです。
処理終了
*/

// NullPointerExceptionとはnull値の参照型変数を参照しようとした時に発生する例外


public class Practice11_01 {
    public static void main(String[] args) {
        try {

            String str01 = null;
            System.out.println(str01.length()); //str01.length()で変数str01が参照している文字列の長さを出力しようとする

        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");

        } finally {
            System.out.println("finally ブロックです。");
        }
        System.out.println("処理終了");
    }
}