
public class Square implements Shape{
	String label;
	public Square() {
		label="Square";
		System.out.println(label);
	}

	@Override
	public void draw(int side, String fillColor, String style) {
		System.out.println(" side"+side+" fillColor"+fillColor+"style"+style);
		System.out.println(this.hashCode());
	}
	

}
