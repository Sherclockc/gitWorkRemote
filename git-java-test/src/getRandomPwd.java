import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//随机生成密码
public class getRandomPwd {
    private static final String lowStr = "abcdefghijklmnopqrstuvwxyz";
    private static final String numStr = "0123456789";
    // 随机获取字符串字符
    private static char getRandomChar(String str) {
        SecureRandom random = new SecureRandom();
        return str.charAt(random.nextInt(str.length()));
    }
    // 随机获取小写字符
    private static char getLowChar() {
        return getRandomChar(lowStr);
    }
    // 随机获取大写字符
    private static char getUpperChar() {
        return Character.toUpperCase(getLowChar());
    }
    // 随机获取数字字符
    private static char getNumChar() {
        return getRandomChar(numStr);
    }

    //指定调用字符函数
    private static char getRandomChar(int funNum) {
        switch (funNum) {
            case 0:
                return getLowChar();
            case 1:
                return getUpperChar();
            default:
                return getNumChar();
        }
    }

    // 指定长度，随机生成复杂密码
    public getRandomPwd(int num) {
        if (num < 8) {
            System.out.println("长度不满足要求");
        }
        List<Character> list = new ArrayList<>(num);
        list.add(getLowChar());
        list.add(getUpperChar());
        list.add(getNumChar());

        for (int i = 3; i < num; i++) {
            SecureRandom random = new SecureRandom();
            int funNum = random.nextInt(3);
            list.add(getRandomChar(funNum));
        }

        Collections.shuffle(list);   // 打乱排序
        StringBuilder stringBuilder = new StringBuilder(list.size());
        for (Character c : list) {
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder);
    }
}
