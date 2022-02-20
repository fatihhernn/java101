package EffectiveJava.item39.markerAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // çalışma zamanında korunması gerektiğini belirtmektedi
@Target(ElementType.METHOD) // bu notasyonun sadece metotlar üzerinde kullanabileceğini belirtmektedir
public @interface Test {

    /**
     * ustteki notasyon bir parametre almıyor
     * methodlarda geçerli ve runtime da iş yapacak
     */


    /**
     *
     * Bir veri hakkında bilgi barındırır ve veri sağlar. Configuration amaçlı kullanılır
     */

    /**
     * SOURCE : Notasyon derleyicisi tarafından atılır
     * CLASS : Notasyon derleyicisi tarafından oluşturulan sınıf dosyasında kaydedilir ve Jvm tarafından saklanması gerekmez. Varsayılan davranış biçimidir
     * RUNTIME : Notasyon derleyicisi dosyasında derleyici tarafından kaydedilir ve çalışma zamanında JVM tarafından saklanır, böylece reflection ile okunabilir
     */


}
