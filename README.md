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

| Halaman | Tampilan |
|---|---|
| Splash | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 01 19" src="https://github.com/user-attachments/assets/ec0ed476-630a-46d1-9921-caf57eeb3c37" /> |
| Sign Up | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 20 34" src="https://github.com/user-attachments/assets/19ee629e-08a1-44ca-8f96-52db26f9f022" /> |
| Login | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 20 34" src="https://github.com/user-attachments/assets/c36df089-819f-46bf-8e31-fca0f62f3021" /> |
| Register | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 22 00" src="https://github.com/user-attachments/assets/a23ec71e-4701-466d-a258-39d3553d4e9f" /> |
| Home | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 22 38" src="https://github.com/user-attachments/assets/42a12025-9681-4de8-9cb2-de337dbd9123" /> |
| Home 2 | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 23 54" src="https://github.com/user-attachments/assets/69a8f5df-ba7a-4ae3-93a6-6cc9eb0fa7a5" /> |
| Profile | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 24 46" src="https://github.com/user-attachments/assets/d14d41bf-cfc3-4873-8e22-416633dc78a6" /> |
| Alamat Pengiriman | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 25 53" src="https://github.com/user-attachments/assets/4f47ad2f-7862-4b0b-91da-ba80392c4e94" /> |
| Alamat Pengiriman 2 | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 26 39" src="https://github.com/user-attachments/assets/3619e453-e90c-4667-a334-a9545887d3dd" /> |
| Konfirmasi Pesanan | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 27 33" src="https://github.com/user-attachments/assets/952f639f-f2b9-4a8f-90cd-75cc54588ae4" /> |
| Konfirmasi Pesanan 2 | <img width="720" height="1440" alt="WhatsApp Image 2026-11-09 at 02 28 17" src="https://github.com/user-attachments/assets/fea04438-e37f-4df7-bf5b-45edc5061d33" /> |

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
