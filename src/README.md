# PasswordValidator

Proyek **PasswordValidator** adalah aplikasi sederhana yang digunakan untuk memvalidasi kata sandi berdasarkan beberapa kriteria keamanan. Program ini memeriksa apakah kata sandi memenuhi syarat panjang minimum, mengandung huruf besar, huruf kecil, angka, dan karakter khusus. Jika kata sandi tidak memenuhi salah satu syarat ini, program akan memberikan pesan kesalahan yang sesuai.

## Fitur

- **Validasi Panjang**: Memastikan kata sandi memiliki panjang minimal 8 karakter.
- **Validasi Huruf Besar**: Memastikan kata sandi mengandung setidaknya satu huruf besar (A-Z).
- **Validasi Huruf Kecil**: Memastikan kata sandi mengandung setidaknya satu huruf kecil (a-z).
- **Validasi Angka**: Memastikan kata sandi mengandung setidaknya satu angka (0-9).
- **Validasi Karakter Khusus**: Memastikan kata sandi mengandung setidaknya satu karakter khusus seperti `!`, `@`, `#`, `$`, `%`, `^`, `&`, atau `*`.

## Struktur Proyek

- **PasswordValidator.java**: Kelas utama yang mengelola proses validasi kata sandi, dengan beberapa metode untuk memeriksa setiap kriteria.
- **InvalidPasswordException.java**: Kelas pengecualian khusus yang digunakan untuk menampilkan pesan kesalahan jika kata sandi tidak memenuhi kriteria yang ditetapkan.

## Prasyarat

- **Java Development Kit (JDK)** versi 8 atau lebih tinggi harus terpasang di sistem Anda.

## Cara Menjalankan Program

1. **Clone atau Unduh Repository**: Unduh atau clone repository ini ke komputer Anda.
   ```bash
   git clone https://github.com/username/PasswordValidator.git


2. Kompilasi Kode: Buka terminal atau command prompt, arahkan ke direktori proyek, dan kompilasi berkas .java:

    ```bash
    javac PasswordValidator.java InvalidPasswordException.java

3. Jalankan Program: Setelah kompilasi, jalankan program menggunakan perintah berikut:

    ```bash
    java PasswordValidator
   
4. Masukkan Kata Sandi: Ikuti instruksi pada layar untuk memasukkan kata sandi. Program akan menampilkan pesan apakah kata sandi valid atau memberikan pesan kesalahan jika tidak valid.

## Contoh Output

Masukkan password: Password123!
Password valid.
Jika kata sandi tidak valid, akan menampilkan pesan seperti berikut:

Masukkan password: password123
Error: Password harus mengandung setidaknya satu huruf besar (A-Z).