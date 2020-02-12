import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
     	System.out.println("Enter the diameter of sphere:");
     	double diameter =s.nextDouble();
     	
     	double r = diameter/2;
            

   
             double  volume= (4*22*r*r*r)/(3*7);

         System.out.println("Volume is:" +volume);
	}

}
