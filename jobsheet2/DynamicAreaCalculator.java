package jobsheet2;

public class DynamicAreaCalculator {
  
    public static void main(String[] args) {
		

		//Veriable
	double Width = 50;
	double Length = 100; 
	 
	double SqureSide = 2;
	
	double Diameter = 2;
	
	//calculations
	
	double TotalArea = Length * Width;  // total area of land 
	
    double SqureArea = SqureSide * SqureSide;  // area of squre pound
    
    double Redious = Diameter / 2;  // diameter of circle
    
    double AreaOfCircle = Math.PI * Math.pow(Redious,2);  //area of circle
    
    double RemaningAreaForGrass = TotalArea - (SqureArea + AreaOfCircle); //Reaming area for grass garden
    
    System.out.println("Total Area = " + TotalArea);
    System.out.println("Area of Squre pond = " + SqureArea);
    System.out.println("Area of Circle Pond = " + AreaOfCircle);
    System.out.println("Remaning area for grass garden = " + RemaningAreaForGrass);
	
	}

}
