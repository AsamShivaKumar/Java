package dataStructures;

import java.util.*;
import static java.lang.System.out;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		
		Pencil pen1 = new Pencil(10, "blue");
		Pencil pen2 = new Pencil(10, "blue");
		
		System.out.println(pen1.equals(pen2));
		
		Set<Pencil> penci = new HashSet<>();
		
		penci.add(pen1);
		penci.add(pen2);
		out.println(penci);

	}

}

 class Pencil {
	 int price;
	 String colour;
	 Pencil(int price, String colour){
		 this.price = price;
		 this.colour = colour;
	 }
	 @Override
	 public boolean equals(Object obj) {
		 boolean isEqual = false;
		 Pencil that = (Pencil)obj;
		 if (this.price == that.price && this.colour == that.colour) isEqual = true;
		 return isEqual;
	 }
	 
	 @Override
	 public int hashCode() {
		 return this.price + this.colour.hashCode();
	 }
 }
