import java.util.ArrayList;
import java.util.Collections;
//解密
//cst fixcode
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
<<<<<<< HEAD
        System.out.println("我是聪明绝顶的蔡少婷");
        System.out.println("与曾文婷同学一起修改了代码");
=======
        System.out.println("我是聪明绝顶的蔡少婷，哈哈哈哈哈哈【惊声尖笑】");
>>>>>>> e25b99aca202918522306ae972619914732e3bbd
        System.out.println("解密的结果是：" + res);
    }
}
