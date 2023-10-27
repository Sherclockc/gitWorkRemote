import java.util.ArrayList;
import java.util.Collections;
//解密
public class Decode {
    public Decode(String str) {
        int length = str.length();
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            alist.add((int)(str.charAt(i)));
        }
        Collections.reverse(alist);
        int a = alist.get(0);
        alist.set(0,alist.get(length-1));
        alist.set(length-1,a);

        int n = 0;
        String res = "";
        for (int i = 0; i < length; i++) {
            alist.set(i,alist.get(i) - (i+1+3));
            n = alist.get(i);
            res += (char)n;
        }
        System.out.println("解密的结果是：" + res);
    }
}
