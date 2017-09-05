package cn.imcompany.annotation;

import org.atteo.classindex.IndexAnnotated;

import java.lang.annotation.*;

@IndexAnnotated
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(ElementType.TYPE)
public @interface MyComponent {

    enum CompileType {
        singleton, propotype, customer
    }

    String name();

    CompileType injectBy() default CompileType.singleton;

    boolean threadsafe() default false;
}
