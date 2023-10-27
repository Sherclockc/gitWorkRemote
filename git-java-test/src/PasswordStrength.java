//判断密码强度
public class PasswordStrength {
    public PasswordStrength(String str) {
        int length = str.length();
        int dig = 0,alpha = 0,capital = 0,lowercaseLetter = 0;
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(str.charAt(i)))
               dig++;
            else if (Character.isLetter(str.charAt(i))){
                alpha++;
                if (Character.isUpperCase(str.charAt(i)))
                    capital++;
                else
                    lowercaseLetter++;
            }
        }
        if (length >= 8) {
            if (dig > 0 && alpha > 0) {
                if (capital > 0 && lowercaseLetter > 0)
                    System.out.println("您的密码为高强度");
                else
                    System.out.println("您的密码为中强度");
            } else
                System.out.println("您的密码为低强度");
        }else
            System.out.println("您的密码为低强度");
    }
}
