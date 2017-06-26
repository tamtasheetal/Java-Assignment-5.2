package FindArea;    
import java.util.*;       
public class FiguresValue      
//This is a Declaration of class containing main function. 
{
	public static void main(String[] args)
{
		double CircleDiameter;      
		double RectangleSide1,RectangleSide2;     
		double TriangleSide;        
	
		Scanner sc=new Scanner(System.in);

		//For Condition 1 => Area & Perimeter of Circle
		System.out.println("Please Enter the Diameter of the Circle :-");     
		CircleDiameter=sc.nextDouble();     
		Circle Circle=new Circle(CircleDiameter);
		Circle.FindArea();       
		Circle.FindPerimeter(); 
		System.out.println();
		
		//For Condition 2 => Area & Perimeter of Rectangle
		System.out.println("Please Enter the two sides of Rectangle :-");     
		RectangleSide1=sc.nextDouble();     
		RectangleSide2=sc.nextDouble();     
		Rectangle Rectangle=new Rectangle(RectangleSide1,RectangleSide2);
		Rectangle.FindArea();      
		Rectangle.FindPerimeter();  
		System.out.println();
		
	    //For Condition 3 => Area & Perimeter of Triangle
		System.out.println("Please Enter the side of Triangle :-");     
		TriangleSide=sc.nextDouble();      
		Triangle Triangle=new Triangle(TriangleSide);
		Triangle.FindArea();       
		Triangle.FindPerimeter();       
		System.out.println();
		
		sc.close();     
		
	}   
}    