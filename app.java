/**
* This is the way you can document your program
*
* @author  Write the author name here
* @version Version
* @since   Date in any format
*
*/

// To know more about documentation visit https://www.tutorialspoint.com/java/java_documentation.htm

// This class can be extended
class User {
	private int id;
	private String name;

	User(int id, String name){
		this.id = id;
		this.name = name;
	}
	/**
   * This is how you can give a description of your method in java documentation
   * Write appropriate definition of your method here
   * The below tags are useful in defining parameters and return type of your method
   * @param a Type int, defines number of ....
   * @param b Type String, defines ....
   * @return Type int This returns 3
   */
	public int documentedMethod(int a, String b){
		return 3;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
}

// This class MUST be extended, you cannot instantiate an abstract class
abstract class Shape {
	// This method needs to be overriden by the classes extending/inheriting this class
	// or else it will throw compilation error
	abstract public String getShape();
	
	// This method can be left untouched by child classes 
	public String getBaseShape(){
		return "Shape";
	}

	// Even this method
	public void getBaseShape2(){

	}

	// But not this, this will throw compilation error, try by uncommenting the below code
	// public void getBaseShape3();
}

// A final class cannot be extended
final class NonExtensibleClass {
	public void message(){
		System.out.println("If you try to extend this class, it will throw error");
	}
}

// Uncomment below code to see compilation error
// class TryingToExtendFinalClass extends NonExtensibleClass{}


class Circle extends Shape {
	// Method Overriding
	@Override
	public String getShape(){
		return "Circle";
	}
}

class Triangle extends Shape {
	// Method Overriding
	@Override
	public String getShape(){
		return "Triangle";
	}
}

public class app {
	public static void main(String ... args) {
		System.out.println(new User(2,"shravan").getName());
		
		// Abstraction : Assigning Circle reference to Shape, child class can be accessed by base class name
		Shape circle = new Circle();
		System.out.println(circle.getShape());

		// No abstraction : Child class called by child name
		Triangle triangle = new Triangle();
		System.out.println(triangle.getShape());

		// Dynamic Binding
		Shape shape;
		// Binding base class to child 1, ie. triangle
		shape = triangle;
		System.out.println(shape.getShape());
		// Binding base class to other child, ie. circle
		shape = circle;
		System.out.println(shape.getShape());

		// Calling non-abstract methods without overriding them
		System.out.println(shape.getBaseShape());
		shape.getBaseShape2();


	}
}