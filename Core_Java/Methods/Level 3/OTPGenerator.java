import java.util.Arrays;
import java.lang.Math;

public class OTPGenerator {

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length - 1; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] generatedOTPs = new int[10];

        System.out.println("Generating 10 OTPs...");
        for (int i = 0; i < 10; i++) {
            generatedOTPs[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(generatedOTPs));

        if (areOTPsUnique(generatedOTPs)) {
            System.out.println("All 10 generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs were found.");
        }
    }
}
