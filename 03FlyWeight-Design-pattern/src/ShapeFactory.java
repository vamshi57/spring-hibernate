import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
  private static Map<String,Shape> cache=new HashMap<>();
  public synchronized static Shape getInstance(String type) {
	  Shape shape=null;
	  if(!cache.containsKey(type)) {
		  if(type.equalsIgnoreCase("circle")) {
			  shape=new Circle();
			  
		  }
		  if(type.equalsIgnoreCase("square")) {
			  shape=new Square();
		  }
		  
		  cache.put(type,shape);
	  }
	  return (Shape)cache.get(type);
  }
  
}
