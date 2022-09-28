package com.nitech.DDD.circularDependency;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.nitech.DDD.circularDependencyOption3" })
public class ComponentConfigTest {

}