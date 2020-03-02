package components.dataproviders;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExcelDataProvider
{
    String fileName();
    String tab();
}
