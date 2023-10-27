import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//�����������
public class getRandomPwd {
    private static final String lowStr = "abcdefghijklmnopqrstuvwxyz";
    private static final String numStr = "0123456789";
    // �����ȡ�ַ����ַ�
    private static char getRandomChar(String str) {
        SecureRandom random = new SecureRandom();
        return str.charAt(random.nextInt(str.length()));
    }
    // �����ȡСд�ַ�
    private static char getLowChar() {
        return getRandomChar(lowStr);
    }
    // �����ȡ��д�ַ�
    private static char getUpperChar() {
        return Character.toUpperCase(getLowChar());
    }
    // �����ȡ�����ַ�
    private static char getNumChar() {
        return getRandomChar(numStr);
    }

    //ָ�������ַ�����
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

    // ָ�����ȣ�������ɸ�������
    public getRandomPwd(int num) {
        if (num < 8) {
            System.out.println("���Ȳ�����Ҫ��");
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

        Collections.shuffle(list);   // ��������
        StringBuilder stringBuilder = new StringBuilder(list.size());
        for (Character c : list) {
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder);
    }
}
