import java.util.Scanner;

/**
 * Kelas PasswordValidator digunakan untuk memvalidasi kata sandi berdasarkan beberapa kriteria keamanan.
 * Kriteria yang diperiksa termasuk panjang kata sandi, keberadaan huruf besar, huruf kecil, angka,
 * dan karakter khusus.
 */
public class PasswordValidator {

    private static final String SPECIAL_CHARACTERS = "[!@#$%^&*]";

    /**
     * Metode utama (main) yang menerima input kata sandi dari pengguna, kemudian memvalidasi kata sandi tersebut.
     * Jika kata sandi tidak valid, maka akan menampilkan pesan kesalahan.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();
            validatePassword(password);
            System.out.println("Password valid.");
        } catch (InvalidPasswordException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Memvalidasi kata sandi dengan memeriksa beberapa kriteria:
     * - Panjang minimal 8 karakter.
     * - Mengandung huruf besar.
     * - Mengandung huruf kecil.
     * - Mengandung angka.
     * - Mengandung karakter khusus.
     *
     * @param password Kata sandi yang akan divalidasi.
     * @throws InvalidPasswordException Jika kata sandi tidak memenuhi salah satu dari kriteria.
     */
    public static void validatePassword(String password) throws InvalidPasswordException {
        checkLength(password);
        checkUppercase(password);
        checkLowercase(password);
        checkDigit(password);
        checkSpecialCharacter(password);
    }

    /**
     * Memeriksa apakah panjang kata sandi memenuhi syarat minimal (8 karakter).
     *
     * @param password Kata sandi yang akan diperiksa.
     * @throws InvalidPasswordException Jika panjang kata sandi kurang dari 8 karakter.
     */
    private static void checkLength(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Panjang password harus minimal 8 karakter.");
        }
    }

    /**
     * Memeriksa apakah kata sandi mengandung setidaknya satu huruf besar (A-Z).
     *
     * @param password Kata sandi yang akan diperiksa.
     * @throws InvalidPasswordException Jika kata sandi tidak mengandung huruf besar.
     */
    private static void checkUppercase(String password) throws InvalidPasswordException {
        if (!matchesPattern(password, "[A-Z]")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu huruf besar (A-Z).");
        }
    }

    /**
     * Memeriksa apakah kata sandi mengandung setidaknya satu huruf kecil (a-z).
     *
     * @param password Kata sandi yang akan diperiksa.
     * @throws InvalidPasswordException Jika kata sandi tidak mengandung huruf kecil.
     */
    private static void checkLowercase(String password) throws InvalidPasswordException {
        if (!matchesPattern(password, "[a-z]")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu huruf kecil (a-z).");
        }
    }

    /**
     * Memeriksa apakah kata sandi mengandung setidaknya satu angka (0-9).
     *
     * @param password Kata sandi yang akan diperiksa.
     * @throws InvalidPasswordException Jika kata sandi tidak mengandung angka.
     */
    private static void checkDigit(String password) throws InvalidPasswordException {
        if (!matchesPattern(password, "[0-9]")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu angka (0-9).");
        }
    }

    /**
     * Memeriksa apakah kata sandi mengandung setidaknya satu karakter khusus,
     * yang ditentukan dalam konstanta `SPECIAL_CHARACTERS`.
     *
     * @param password Kata sandi yang akan diperiksa.
     * @throws InvalidPasswordException Jika kata sandi tidak mengandung karakter khusus.
     */
    private static void checkSpecialCharacter(String password) throws InvalidPasswordException {
        if (!matchesPattern(password, SPECIAL_CHARACTERS)) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu karakter khusus " + SPECIAL_CHARACTERS + ".");
        }
    }

    /**
     * Memeriksa apakah kata sandi cocok dengan pola tertentu.
     *
     * @param password Kata sandi yang akan diperiksa.
     * @param pattern Pola yang akan dicocokkan dengan kata sandi.
     * @return true jika kata sandi sesuai dengan pola, false jika tidak.
     */
    private static boolean matchesPattern(String password, String pattern) {
        return password.matches(".*" + pattern + ".*");
    }
}
