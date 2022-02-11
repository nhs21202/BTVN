package org.project.PROJECT;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle; 
public class Form {
	Rectangle a,b,c,d;
	Color color;
	private String name;
	public int form = 1;

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d,String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = name;
	// set color for shapes
		switch(name) {
		case "j":
			color = Color.AQUAMARINE;
			break;
		case "l":
			color = Color.BLUEVIOLET;
			break;
		case "o":
			color = Color.HOTPINK;
			break;
		case "z":
			color = Color.INDIANRED;
			break;
		case "s":
			color = Color.FORESTGREEN;
			break;
		case "i":
			color =Color.CORNFLOWERBLUE;
			break;
		case "t":
			color = Color.GOLDENROD;
			break;
		}
	this.a.setFill(color);
	this.b.setFill(color);
	this.c.setFill(color);
	this.d.setFill(color);
	}
	//getter
	public String getName() {
		return name;
	}
	// mỗi khối sẽ có 4 chiều xoay khác nhau
	public void FormRotation() {
		if(form!=4) form++;
		else form = 1;
	}
}
