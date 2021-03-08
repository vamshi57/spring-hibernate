
public class Client {
	public static void main(String[] args) {
		Shape shape1=null,shape2=null;
		for(int i=1;i<10;i++) {
			shape1=ShapeFactory.getInstance("circle");
			shape1.draw(10, "  yellow", "   good");
			
		}
		System.out.println();
		for(int i=1;i<10;i++) {
			shape2=ShapeFactory.getInstance("square");
			shape2.draw(12, "   blue", "     not good");
			
		}
		
	}

}
