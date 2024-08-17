/*
新規Java ファイル「Practice12_02.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。
演習問題_1 のソースコード、 ArrayList を TreeSet に変換してください。
 */

 import java.util.ArrayList;
 import java.util.TreeSet;
 import java.util.List;
 import java.util.Set;

 public class Practice12_02 {
     public static void main(String[] args) {
 
         ArrayList<String> list = new ArrayList<>();
 
         list.add("kubo");
         list.add("mitoma");
         list.add("kamada");
         list.add("kamada");
 
        Set<String> set = new TreeSet<String>(list);
        
        // System.out.println(set);
        
        for (String name : set) {
            System.out.println(name);
        }
     }
 }
 