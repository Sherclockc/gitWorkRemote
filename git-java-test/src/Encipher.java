import java.util.ArrayList;
import java.util.Collections;

public class Encipher {
    public Encipher(String str) {
        int length = str.length();
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            alist.add(((int)(str.charAt(i))) + (i+1+3));
        }
        //��һ���ַ������һ���ַ�����
        int a = alist.get(0);
        alist.set(0,alist.get(length-1));
        alist.set(length-1,a);

        //�ַ�����ת
        Collections.reverse(alist);
        str = "";
        for (int i = 0; i < length; i++) {
            int n = alist.get(i);
            str +=(char)n;
        }
        System.out.println("���ܵĽ���ǣ�" + str);
    }
}
