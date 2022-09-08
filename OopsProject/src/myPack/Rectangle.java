package myPack;

public class Rectangle extends Square {
int width=7;
//override the method
public int area() 
{
	int area = length*width;
	return area;
}
}
