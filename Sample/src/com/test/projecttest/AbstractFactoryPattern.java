package com.test.projecttest;

public class AbstractFactoryPattern {

	
	  public static void main(String[] args) {
		  ShapeBuilder ob  = new ShapeBuildImpl() ;
		  System.out.println(ob.getShape(true, "circle").getClass());
		  //ob.getShape(true, "circle");
	}
}


interface  Shape {
	public Shape getShape();
}

class  Circle implements  Shape{

	@Override
	public Shape getShape() {
		
		return new Circle();
	}
	
}


class  Rectangle implements  Shape{

	@Override
	public Shape getShape() {
		
		return new Rectangle();
	}
	
}



interface  ColourfulShape {
	public ColourfulShape getShape();
}

class  ColourfulCircle implements ColourfulShape {

	@Override
	public ColourfulShape getShape() {
		
		return new ColourfulCircle();
	}
	
}
class  ColourfulRectangle implements ColourfulShape {

	@Override
	public ColourfulShape getShape() {
		
		return new ColourfulRectangle();
	}
	
}


class ColorFulShapeBuilder {
	public ColourfulShape getShape(String  st) {
		if(st.equals("rectangle")) {
			return new ColourfulRectangle();
		}
		if(st.equals("circle")) {
			return new ColourfulCircle();
		}
		return null;
		
	}
}

class NormalShapeBuilder {
	public Shape getShape(String  st) {
		if(st.equals("rectangle")) {
			return new Rectangle();
		}
		if(st.equals("circle")) {
			return new Circle();
		}
		return null;
		
	}
}



interface  ShapeBuilder {
	public  Object getShape(boolean wantColor,String shapeName ) ; 
}


class ShapeBuildImpl  implements  ShapeBuilder {
    @Override
	public Object getShape(boolean wantColor, String shapeName) {
		if(wantColor) {
		 return	new ColorFulShapeBuilder().getShape(shapeName);
 		}
		else {
			return new NormalShapeBuilder().getShape(shapeName);
		}
		
	}

}


