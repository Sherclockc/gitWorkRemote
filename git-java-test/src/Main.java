import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================"+"\n欢迎使用密码管理系统"+"\n================");
        System.out.println("请选择操作：");
        System.out.println("1.加密\n2.解密\n3.判断密码强度\n4.密码生成\n5.退出\n");
        System.out.print("请输入选项序号：");
        int operateNum = sc.nextInt();
        System.out.println("\n================"+"\n欢迎使用密码管理系统"+"\n================");
        switch (operateNum) {
            case 1:
                System.out.print("请输入要加密的数字密码:");
                String jiaMiStr = sc.next();
                new Encipher(jiaMiStr);
                break;
            case 2:
                System.out.print("请输入要解密的数字密码:");
                String jieMiStr = sc.next();
                new Decode(jieMiStr);
                break;
//            case 3:
//                System.out.print("请输入要进行判断的密码:");
//                String panDuanStr = sc.next();
//                new PasswordStrength(panDuanStr);
//                break;
//            case 4:
//                System.out.print("请输入需要生成密码的长度:");
//                int length = sc.nextInt();
//                new getRandomPwd(length);
            default:
                break;
        }
    }
}