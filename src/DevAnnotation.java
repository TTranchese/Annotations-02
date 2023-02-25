import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface DevAnnotation {
	String DevName();
	String DevSurname();
}