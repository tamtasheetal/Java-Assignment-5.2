package FindArea;
public class Rectangle extends Figure
{
	double dim2;
	//Variable to present the side length.
	double areaRectangle;
	double perimeterRectangle;
	
	public Rectangle(double dim1, double dim2)
	{
		super.dim1=dim1;//For first side
		this.dim2=dim2; //For Second side
	}
	public void FindArea()
	{
		areaRectangle=dim1*dim2;
		System.out.println("The Area of a Rectangle is :-"+areaRectangle);
	}
	public void FindPerimeter()
	{
		perimeterRectangle=2*(dim1+dim2);
		System.out.println("The Perimeter of a Rectangle is :-"+perimeterRectangle);
	}

}
