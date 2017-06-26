package FindArea;

public class Triangle extends Figure      
{
	double areaTriangle;      
	double perimeterTriangle;    
	double sqrtOfThree=1.7320; 
	//variable to store the value of square root of three.
	
	public Triangle(double dim1)    
	{
		super.dim1=dim1;         
	}
	
	public void FindArea()
	{
		areaTriangle= (sqrtOfThree*dim1*dim1)/4;          
		System.out.println("The Area of A Triangle is :-"+areaTriangle);     
	}
	
	public void FindPerimeter()
	{
		perimeterTriangle = 3*dim1 ;      
		System.out.println("The Perimeter of A Triangle is :-"+perimeterTriangle);       
	}
}

