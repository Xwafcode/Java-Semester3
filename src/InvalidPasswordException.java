/**
 * Kelas InvalidPasswordException digunakan untuk menangani pengecualian khusus 
 * saat kata sandi tidak memenuhi kriteria validasi yang ditentukan.
 */
class InvalidPasswordException extends Exception {

    /**
     * Konstruktor untuk InvalidPasswordException yang menerima pesan khusus.
     *
     * @param message Pesan kesalahan yang memberikan informasi mengenai alasan kegagalan validasi kata sandi.
     */
    public InvalidPasswordException(String message) {
        super(message);
    }
}
