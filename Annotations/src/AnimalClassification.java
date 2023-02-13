import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnimalClassification {
    String kingdom() default "Animalia";
    String phylum() default "Chordata";
    String class_() default "Mammalia";
    String order() default "Carnivora";
    String family() default "Canidae";
}