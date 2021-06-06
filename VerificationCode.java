import java.util.Random;

public class VerificationCode {
    private String Code;

    public void CodeGenerator(){
        Random random = new Random();
        int preCode;
        preCode = random.nextInt((100000-10000) + 1) + 10000;
        Code = String.valueOf(preCode);
    }

    public boolean CodeCheck(String UserCode)
    {
        if (UserCode.equals(Code))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return Code;
    }
}
