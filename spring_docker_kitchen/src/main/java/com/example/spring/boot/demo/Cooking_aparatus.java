package com.example.spring.boot.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
public class Cooking_aparatus {
private String name;
public Cooking_aparatus() {
	this.name = name;

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
