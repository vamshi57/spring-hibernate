
public class Circle implements Shape{
	private String label;
	public Circle() {
		label="circle";
		System.out.println(label+" constructor");
	}
	@Override
	public void draw(int radias, String fillColor, String style) {
		System.out.println("radias="+radias+"fillColor ="+fillColor+" style="+style);
		System.out.println(this.hashCode());
		
		
	}
	

}
