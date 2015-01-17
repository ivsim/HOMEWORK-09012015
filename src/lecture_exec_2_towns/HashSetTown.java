package lecture_exec_2_towns;

import java.util.HashSet;

public class HashSetTown {

	public static void main(String[] args) {

		HashSet<Town> townCollection = new HashSet<Town>();
 
		Town town1 = new Town("pernik", "BG", 2300);
		Town town3 = new Town("gorna orj", "BG", 2654);
		
		townCollection.add(town1);
		townCollection.add(new Town("vt", "BG", 1256));
		townCollection.add(town3);
		townCollection.add(new Town("sf", "BG", 6542));
		townCollection.add(new Town("vidin", "BG", 2123));
		
		Town townToCompare = new Town("pernik", "BG", 2300);
		Town townToCompare2 = town3;
		
		if (townToCompare.name.equals(town1.name) && townToCompare.state.equals(town1.state) && townToCompare.population == town1.population){
			System.out.println("True");
		}
		else{System.out.println("False");}
		
		if (townToCompare2.name.equals(town3.name) && townToCompare2.state.equals(town3.state) && townToCompare2.population == town3.population){
			townCollection.remove(town3);
		}
			

		for (Town x : townCollection){
			System.out.println(x.name);
			}


		
		
		
		
		
		
		
	}

}
