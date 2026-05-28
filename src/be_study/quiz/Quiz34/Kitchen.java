package be_study.quiz.Quiz34;

import java.util.ArrayList;

public class Kitchen {
	int size;
	int height;
	String color;
	
	Refrigerator refrigerator;
	
	Stove stove;
	
	Sink sink;
	
//	Trash trash;
	ArrayList<Trash> trashList;
	
	ArrayList<Cup> CupList;
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
