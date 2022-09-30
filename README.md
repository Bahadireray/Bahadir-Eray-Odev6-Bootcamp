# Bahadir-Eray-Odev6-Bootcamp

## Coroutine Dispatcher 
### Coroutine’in çalışacağı thread’ e karar veren yapıdır.

Dispatchers.Unconfined: Çağrıldığı thread’de bir coroutine başlatır. Suspend fonksiyonu tarafından kullanılan herhangi bir thread içinde herhangi bir özel thread olmadan devam etmesini sağlar. Main Thread işlemlerinde kullanılır ama genellikle kullanılması önerilmez.

Dispatchers.Default: Herhangi bir özel durum olmaksızın, launch ve async gibi standart coroutine oluşturucularının varsayılan dispatcher'ıdır. Özellikle CPU ile alakalı işlerde kullanılır.

Dispatchers.IO: Disk ve Network işlemlerinde kullanılır.

Dispatchers.Main: UI thread işlemleriyle çalışan ve Main Thread ile sınırlı bir dispatcher'dır.




![dongu](https://user-images.githubusercontent.com/57098047/193298635-4c6a0ff9-2055-403e-b209-3caff384b3ac.jpg)

