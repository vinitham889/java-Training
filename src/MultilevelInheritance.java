
 public class MultilevelInheritance {
	 void food()
	 {
		 System.out.println("Veg or Non-veg");
	 }
 }
	

  class vegRestaurants extends MultilevelInheritance
 {
	 void veg()
	 {
		 System.out.println("Navarasa , udupi, sagar");
	 }
 }
 
class nonvegRestaurants extends vegRestaurants
{  void nonVeg()
	{
	   System.out.println("Taj , Bagini , ibis");
	}
}
	
 
