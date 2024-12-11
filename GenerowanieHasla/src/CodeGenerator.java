import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

public class CodeGenerator {
    private final int length;
    private final SecureRandom random;

    private static final int[] ALLOWED_LENGTHS = {4, 6, 12, 16};

    private static final String TOKEN_CHARACTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public CodeGenerator(int length) {
        if (!isValidLength(length)) {
            throw new IllegalArgumentException("Długość musi być 4, 6, 12 lub 16.");
        }
        this.length = length;
        this.random = new SecureRandom();
    }

    private boolean isValidLength(int length) {
        for (int allowedLength : ALLOWED_LENGTHS) {
            if (length == allowedLength) {
                return true;
            }
        }
        return false;
    }

    public String generateCode() {
        StringBuilder code = new StringBuilder(length);

        if (length == 4 || length == 6) {
            generatePinCode(code);
        } else {
            generateToken(code);
        }

        return code.toString();
    }

    private void generatePinCode(StringBuilder code) {
        for (int i = 0; i < length; i++) {
            code.append(random.nextInt(10));
        }
    }

    private void generateToken(StringBuilder code) {
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(TOKEN_CHARACTERS.length());
            code.append(TOKEN_CHARACTERS.charAt(index));
        }
    }

    public void saveToFile(String fileName, String code) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(code);
            System.out.println("Kod zapisano do pliku: " + fileName);
        } catch (IOException e) {
            System.err.println("Błąd zapisu do pliku: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int codeLength = 12;
        String fileName = "generated_code.txt";

        CodeGenerator generator = new CodeGenerator(codeLength);
        String code = generator.generateCode();
        System.out.println("Wygenerowany kod: " + code);

        generator.saveToFile(fileName, code);
    }
}
