package com.panjoy.structure.proxy.dynamic;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
@Documented
public @interface Response {
	String name() default "panjoy";

	String value() default "";

	int[] array() default { 0 };

	Class<String> classType() default String.class;

}
