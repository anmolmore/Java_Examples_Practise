package com.javapapers.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnnotations {
	
	public static void main(String args[]) throws SecurityException, ClassNotFoundException
	{
		for(Method method:Class.forName("com.javapapers.annotations.BuildHouse").getMethods()) {
			if(method.isAnnotationPresent(com.javapapers.annotations.Developer.class)) {
				try {
					for(Annotation anno : method.getDeclaredAnnotations()) {
						System.out.println("Annotation in method" + method.getName() + " " + anno);
						Developer a = method.getAnnotation(Developer.class);
			            if ("Popeye".equals(a.value())) {
			              System.out.println("Popeye the sailor man! " + method);
			            }
					}
				}
				catch(Throwable exp) {
					exp.printStackTrace();
				}
			}
		}
	}
}
