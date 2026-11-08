# ☕ Kopi dan Nyemil

Aplikasi mobile pemesanan kopi dan camilan berbasis **Android (Kotlin)** dengan tampilan modern, menarik, dan mudah digunakan. Aplikasi ini dibuat untuk memenuhi tugas Ujian Tengah Semester (UTS) mata kuliah **Pengembangan Aplikasi Mobile**.

> **Tagline:** *Get a taste of your wish*

## 📱 Deskripsi Aplikasi

Kopi dan Nyemil merupakan aplikasi Android yang memungkinkan pengguna untuk memesan berbagai pilihan kopi, minuman, dan camilan secara praktis melalui smartphone.

Pengguna dapat membuat akun, login, melihat daftar menu, memilih makanan atau minuman, mengatur jumlah pesanan, mengisi alamat pengiriman, hingga mendapatkan konfirmasi pesanan.

Aplikasi ini menggunakan **data statis (dummy data)** dan tidak memerlukan database.

## ✨ Fitur Aplikasi

- **Splash / Welcome:** Halaman pembuka aplikasi.
- **Sign Up:** Pilihan untuk masuk atau membuat akun.
- **Login:** Masuk menggunakan akun pengguna dengan validasi.
- **Register:** Membuat akun baru dengan validasi input.
- **Home:** Menampilkan daftar makanan dan minuman dengan gambar dan harga.
- **Kategori Menu:** Memudahkan pengguna memilih kategori makanan atau minuman.
- **Keranjang:** Menambahkan dan mengurangi jumlah pesanan.
- **Profile:** Menampilkan dan mengubah informasi pengguna serta logout.
- **Alamat Pengiriman (Order):** Mengisi informasi penerima dan alamat pengiriman.
- **Konfirmasi Pesanan:** Menampilkan informasi keberhasilan pemesanan, status pesanan, dan ringkasan transaksi.
- **Bottom Navigation:** Memudahkan perpindahan antarhalaman aplikasi.

## 🛠️ Teknologi yang Digunakan

- **Bahasa Pemrograman:** Kotlin
- **IDE:** Android Studio
- **Layout UI:** XML
- **Android SDK:** Android SDK
- **Build System:** Gradle
- **AndroidX:** AppCompat dan komponen AndroidX.
- **Data:** Dummy Data (tanpa database).

## 🚀 Cara Menjalankan Aplikasi

1. Install Android Studio pada komputer.
2. Clone atau download repository ini.
3. Buka folder project `KopiDanNyemil` menggunakan Android Studio.
4. Tunggu proses Gradle Sync hingga selesai.
5. Hubungkan perangkat Android atau jalankan emulator.
6. Klik tombol **Run ▶** untuk menjalankan aplikasi.

**Persyaratan:**
- Android Studio.
- JDK yang sesuai dengan konfigurasi Gradle project.
- Perangkat Android atau emulator.

## 🔄 Alur Aplikasi

`Splash (Welcome) → Sign Up → Login → Register → Home → Profile → Order (Alamat Pengiriman) → Konfirmasi Pesanan`

Pengguna juga dapat berpindah ke halaman Profile melalui Bottom Navigation.

## 📸 Screenshot Aplikasi

Screenshot tampilan aplikasi akan ditambahkan pada folder `screenshots` di repository ini.

KopiDanNyemil/
├── screenshots/
│   ├── 01_splash.png
│   ├── 02_signup.png
│   ├── 03_login.png
│   ├── 04_register.png
│   ├── 05_home.png
│   ├── 06_profile.png
│   ├── 07_alamat.png
│   └── 08_konfirmasi.png
├── app/
├── README.md

## 📸 Screenshot Aplikasi

<div align="center">
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 01 19" src="https://github.com/user-attachments/assets/cc3bdb8b-8e5c-487c-a445-04d4c1e352ab" />
 alt="Splash" />
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 20 34" src="https://github.com/user-attachments/assets/d19ba2b9-7e59-43ed-ad8c-9a1a8ba623e5" />
 alt="Sign Up" />
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 20 34" src="https://github.com/user-attachments/assets/b309980c-8c07-4352-b5da-558240aab6b9" />
 alt="Login" />
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 22 00" src="https://github.com/user-attachments/assets/367b17d8-424a-4273-a027-a5563b50cdbf" />
 alt="Register" />
</div>

<div align="center">
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 22 38" src="https://github.com/user-attachments/assets/f0087376-ac43-4193-bc2c-9b4683741bb1" />
 alt="Home" />
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 23 54" src="https://github.com/user-attachments/assets/5075507d-d586-4a29-8bfc-5684e06a8cf6" />
 alt="Home 2" />
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 24 46" src="https://github.com/user-attachments/assets/238fbf1c-7aa4-4125-aa81-2d62654e18ba" />
 alt="Profile" />
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 25 53" src="https://github.com/user-attachments/assets/b5e24c68-2c51-48d0-9dca-4191dd2553ab" />
 alt="Alamat Pengiriman" />
</div>

<div align="center">
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 26 39" src="https://github.com/user-attachments/assets/f096a4e4-9242-4a84-ad51-af5216a92fc6" />
" alt="Alamat Pengiriman 2" />
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 27 33" src="https://github.com/user-attachments/assets/b67ce20e-a1c0-4d7c-85a0-2bb4fb3f346a" />
 alt="Konfirmasi Pesanan" />
  <img width="180" src=<img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 28 17" src="https://github.com/user-attachments/assets/a0197f85-a35d-48c9-8fd8-fe48f9a5ca01" />
 alt="Konfirmasi Pesanan 2" />
</div>

## 📁 Struktur Project

```text
KopiDanNyemil/
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/kopidannyemil/
│           │       ├── MainActivity.kt
│           │       ├── HomeActivity.kt
│           │       ├── LoginActivity.kt
│           │       ├── RegisterActivity.kt
│           │       ├── ProfileActivity.kt
│           │       ├── OrderActivity.kt
│           │       ├── ConfirmationActivity.kt
│           │       └── FoodAdapter.kt
│           └── res/
│               ├── drawable/
│               ├── layout/
│               └── values/
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 👤 Author

- **Nama:** Fikri Ahmad Ramdani
- **GitHub:** [@FikriAhmd](https://github.com/FikriAhmd)
- **Repository:** [KopiDanNyemil](https://github.com/FikriAhmd/KopiDanNyemil)

---

*Dibuat dengan ☕ dan semangat untuk memenuhi tugas UTS Pengembangan Aplikasi Mobile.*
