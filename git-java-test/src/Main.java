import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================"+"\n��ӭʹ���������ϵͳ"+"\n================");
        System.out.println("��ѡ�������");
        System.out.println("1.����\n2.����\n3.�ж�����ǿ��\n4.��������\n5.�˳�\n");
        System.out.print("������ѡ����ţ�");
        int operateNum = sc.nextInt();
        System.out.println("\n================"+"\n��ӭʹ���������ϵͳ"+"\n================");
        switch (operateNum) {
            case 1:
                System.out.print("������Ҫ���ܵ���������:");
                String jiaMiStr = sc.next();
                new Encipher(jiaMiStr);
                break;
            case 2:
                System.out.print("������Ҫ���ܵ���������:");
                String jieMiStr = sc.next();
                new Decode(jieMiStr);
                break;
//            case 3:
//                System.out.print("������Ҫ�����жϵ�����:");
//                String panDuanStr = sc.next();
//                new PasswordStrength(panDuanStr);
//                break;
//            case 4:
//                System.out.print("��������Ҫ��������ĳ���:");
//                int length = sc.nextInt();
//                new getRandomPwd(length);
            default:
                break;
        }
    }
}