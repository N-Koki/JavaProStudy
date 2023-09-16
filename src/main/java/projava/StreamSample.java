package projava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Streamについて学習
 *
 * Streamとは値の集合に対する処理を使い回す仕組み
 *
 */
public class StreamSample {
    public static void main(String[] args){
       Sample1();
       Sample2();
       Sample3();
    }

    public static void Sample1(){
        List<String> data = List.of("yamamoto", "kis", "sugiyama");

        List<String> result = data.stream()   //Streamソース：値の集合からStreamを取り出す
                .filter(s -> s.length() >= 5) //中間処理：5以上の文字列を取り出す処理
                .toList();                    //終端処理：リストに変換
        System.out.println(result);
    }

    public static void Sample2(){
        List<String> data = List.of("yamamoto", "kis", "sugiyama");

        int result = (int) data.stream()
                .filter(s -> s.length() >= 5)
                .count();
        System.out.println(result);
    }

    public static void Sample3(){
        var data = List.of("yamato", "takeshi");

        var result = 0;

        for(var s : data){
            if(s.length() >= 5){
                result++;
            }
        }
        System.out.println("for文結果" + result);

    }


}
