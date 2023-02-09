import java.util.ArrayList;

import static javax.print.attribute.standard.MediaSizeName.A;

public class Password {

    private String name;
    private String encryption;
    private int sign;

    public static void main(String[] args) {
        Password first = new Password("first", "encrypto", 4 );
        System.out.println(first.toString());
    }

    public Password(String name, String encryption, int sign) {
        this.name = name;
        this.encryption = encryption;
        setSign(sign);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        if(sign < 0)
        {
            this.sign = 0;
        }
        else{
            this.sign = sign;
        }
    }

    public int  validatePasswordStrength(){

        String password = "12334A%";

        if(sign < 8)
        {
            return 0;
        }
        else if(sign >= 8){
            return 1;
        }
        else
        {
            return 2;
        }
    }


    @Override
    public String toString() {
        return "Password{" +
                "name='" + name + '\'' +
                ", encryption='" + encryption + '\'' +
                ", sign=" + sign +
                '}';
    }
}
