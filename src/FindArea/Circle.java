package FindArea;
public class Circle extends Figure
{
double areaCircle;
double perimeterCircle;
double Pivalue=3.141;
//Here 3.141 is a value of a pi.
public Circle(double dim1)
{
	super.dim1=dim1;
	//This initialize the diameter of a circle.
}
public void FindArea()
{
	areaCircle=(Pivalue*dim1*dim1)/4;
			System.out.println("The Area of a Circle is :-"+areaCircle);
}
public void FindPerimeter()
{
	perimeterCircle=Pivalue*dim1;
	System.out.println("The Perimeter of a Circle is :-"+perimeterCircle);
}
}
