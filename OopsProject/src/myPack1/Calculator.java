package myPack1;
public class Calculator
{
	double x,y,z;
	//default constructor
	Calculator(){
		x=0;
		y=0;
	}
	//parametrized constructor
    public Calculator(double x, double y)
    {
		this.x = x;
		this.y = y;
	}
    int add(int x,int y)
    {
    	return(x+y);
    }
    String String(String x,String y){
    	return(x+y);
    }
    double add(double x,int y,int z)
    {
    	return(x+y+z);
    }
    int substract(int x,int y)
    {
    	return(x-y);
    }
    double substract(double x,double y)
    {
    	return(x-y);
    }
    public static void main(String args[])
    {
	Calculator c1=new Calculator();
	System.out.println("addition is ="+	c1.add(5, 6));
	System.out.println("addition is ="+	c1.add(5.6, 6,9));
	System.out.println("string  is ="+	c1.String("9", "4"));

	System.out.println("substraction is ="+	c1.substract(9, 4));
	System.out.println("substraction is ="+	c1.substract(9.3, 4.3));



}


}

