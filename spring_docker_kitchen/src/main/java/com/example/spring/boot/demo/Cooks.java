package com.example.spring.boot.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
@RestController
@ComponentScan

public class Cooks {
private int rank;
private int proficiency;
private String name;
private String catch_phrase;

public Cooks() {
	
	this.rank = rank;
	this.proficiency = proficiency;
	this.name = name;
	this.catch_phrase = catch_phrase;
	
	
}

public int getRank() {
	return rank;
}

public void setRank(int rank) {
	this.rank = rank;
}

public int getProficiency() {
	return proficiency;
}

public void setProficiency(int proficiency) {
	this.proficiency = proficiency;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCatch_phrase() {
	return catch_phrase;
}

public void setCatch_phrase(String catch_phrase) {
	this.catch_phrase = catch_phrase;
}

@Override
public String toString() {
	return "Cooks [rank=" + rank + ", proficiency=" + proficiency + ", name=" + name + ", catch_phrase=" + catch_phrase
			+ "]";
}



}
