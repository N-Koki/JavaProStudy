package projava;

public class Olympic {

    /**
     * 渡された西暦年が夏季近代オリンピック開催年であるかどうか判定する
     * @param year 西暦年
     * @return 夏季オリンピック開催年であればtrue
     * @throws IllegalArgumentException まだオリンピック開催が確定していない年を渡した場合
     */
    public boolean isSummerOlympicYear(int year) throws IllegalArgumentException{
        if (2032 < year){
            throw new IllegalArgumentException("2032年までをサポートしています。入力：" + year);
        }
        return year % 4 == 0;
    }

    public static void main(String[] args){
        new Olympic().isSummerOlympicYear(2022);
        return;
    }
}
