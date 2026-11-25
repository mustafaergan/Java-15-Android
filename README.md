# Java ile Android Eğitim Örnekleri

Android eğitiminde derste yazılmış küçük uygulamalar. Her klasör ayrı bir Android Studio projesidir; daha önce ayrı
depolarda duran projeler 2017'de bu depoda birleştirildi.

> **Not:** Bu depo 2016–2017 yıllarında eğitim amaçlı yazıldı ve artık güncellenmiyor. Bağımlılıkları ve Android
> Gradle eklentisi çok eskidir, bilinen güvenlik açıkları içerebilir; üretimde kullanmayın.

## İçerik

| Klasör | Ne yapar |
|---|---|
| `Java-15-Android-ToastMesaj-master/` | Toast mesajı, `Log` ve evet/hayır seçenekli `AlertDialog` |
| `Java-15-Android-Intent-master/` | `Intent` ile ikinci ekrana veri (`putExtra`) gönderme |
| `Java-15-Android-Login-master/` | Sabit kullanıcı bilgisiyle basit giriş ekranı, başarılı girişte karşılama ekranı |
| `Java-15-Android-ListView-master/` | `ArrayAdapter` ile liste, tıklamada diyalog, yazdıkça filtreleme |
| `Java-15-Android-GenericListView-master/` | `BaseAdapter`'dan türetilen özel adaptör ve satır tasarımıyla kişi listesi |
| `Java-15-Android-Kutuphane-master/` | `SQLiteOpenHelper` ile yerel veritabanına kayıt ekleme ve listeleme |
| `Java-15-Android-Anim-master/` | XML'de tanımlı animasyonu bir resme uygulama |
| `Java-15-Android-Vibrator-master/` | Titreşim (`Vibrator`) ve seçenekler menüsü |
| `Java-15-Android-GPS-master/` | Çalışma anında konum izni isteme, `LocationManager` ile konum alıp haritada açma |
| `Java-15-Android-WebView-master/` | `WebView` içinde web sayfası açma |
| `Java-15-Android-WebViewTekrar-master/` | `WebView` tekrar örneği; onay kutusu işaretliyse girilen kelimeyi Twitter'da arar |
| `android-karma-ornek-master/` | Karışık örnek: ekranlar arası geçiş, diyalog, menü, `Spinner` ve liste |

## Teknolojiler

- Java, Android SDK 24 (karma örnekte 25), en düşük API 18 (karma örnekte 15)
- Android Gradle eklentisi 2.1.2 / 2.3.2, Gradle 2.10 / 3.3 (her projede Gradle wrapper var)
- Android Support Library (`appcompat-v7` 24.1.1 / 25.3.1); GPS örneğinde Google Play Services 8.1.0

## Çalıştırma

1. Android Studio'da "Open" ile istediğiniz proje klasörünü açın (deponun kökünü değil).
2. Projeler çok eski Gradle sürümleriyle yazıldığı için güncel Android Studio açarken Gradle ve eklenti
   sürümlerini yükseltmeyi önerecektir; bu yükseltme yapılmadan derleme büyük olasılıkla çalışmaz.
3. Bir emülatör ya da cihaz seçip uygulamayı çalıştırın. GPS örneği için konum izni verilmesi gerekir.
