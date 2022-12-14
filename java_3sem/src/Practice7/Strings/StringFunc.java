package Practice7.Strings;

public class StringFunc implements StringProcess{
    @Override
    public int length(String str) {
        return str.length();
    }

    @Override
    public String revers(String str) { // переворачивает строку
        String rev = "";
        for (int i = 0; i < str.length(); i++) rev = str.charAt(i) + rev;
        return rev;
    }

    @Override
    public String oddString(String str) { // состоавляет новую строку из символов на четных позициях
        String res = "";
        for (int i = 0; i < str.length(); i++) if (i % 2 != 0) res += str.charAt(i);
        return res;
    }
}

