import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<?> catClass = Cat.class;
        Annotation animalClass = catClass.getAnnotation(AnimalClassification.class);
        if (animalClass instanceof AnimalClassification) {
            AnimalClassification classification = (AnimalClassification) animalClass;
            System.out.println("Kingdom: " + classification.kingdom());
            System.out.println("Phylum: " + classification.phylum());
            System.out.println("Class: " + classification.class_());
            System.out.println("Order: " + classification.order());
            System.out.println("Family: " + classification.family());
        }
    }
}