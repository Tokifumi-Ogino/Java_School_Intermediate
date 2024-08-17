/*
新規Java ファイル「Practice12_01.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

以下のソースコードを ArrayList に書き換えてください。
    String[] arr;
    arr = new String[3];

    arr[0] = "kubo";
    arr[1] = "mitoma";
    arr[2] = "kamada";
    arr[3] = "kamada";

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
 */

import java.util.ArrayList;

public class Practice12_01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("kubo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
        }

    }

}
