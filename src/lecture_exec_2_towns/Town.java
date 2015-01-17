package lecture_exec_2_towns;

public class Town {

	public String name;
	public String state;
	public int population;
	
	public Town(String name, String state, int population){
		this.name = name;
		this.state = state;
		this.population = population;
	}
	
	//overriding .hashCode() and .equals()
	
	public int hashCode(){
				
		return (this.name + this.state + this.population).hashCode(); 
	}
	
	public boolean equals(Object o){
		if (o == null){return false;}
		if (! (o instanceof Town)){return false;}
		
		Town other = (Town)o;
		return this.hashCode() == other.hashCode();
	}
	
}
