
public class DotaHero {
	public static final String S = "STRENGTH";
	public static final String A = "AGILITY";
	public static final String I = "INTELLIGENCE";
	private String Name;
	private String Type;// S A I
	private int CarryPoint;
	/* the carry point is from 1 to 5*/
	/**
	 * 5 is the hard carry
	 * 4 is mid line carry
	 * 3 is offline
	 * 2 is jungle support or carry support
	 * 1 is the hard support
	 */
	private boolean [] Ability;
	/**
	 *  Ability[0] is Push 1 is has ability to push, 0 is not have the ability
	 *  The length of Ability is 5(can be longer than 5 if I want to add more ability to hero
	 *  Ability[1] is AOE
	 *  Ability[2] is Stun
	 *  Ability[3] is Escape
	 *  Ability[4] is SlowDown
	 *  */
	public DotaHero(String Name, String Type, int CarryPoint,boolean[] Ability){
		this.Name = Name;
		this.Type = Type;
		this.CarryPoint = CarryPoint;
		this.Ability = Ability;
	}
	// the copy constructor
	public DotaHero(DotaHero hero){
		this.Name = hero.Name;
		this.Type = hero.Type;
		this.CarryPoint = hero.CarryPoint;
		this.Ability = hero.Ability;
	}
	/* 
	 * The new HashCode I write, and it is not necessary
	 * */

	/*	public boolean equals(Object obj){
		DotaHero p = (DotaHero) obj;
		return Name ==p.Name && Type== p.Type && 
				CarryPoint == p.CarryPoint && Ability.equals(p.Ability);
	}
	public int hashCode(){
		int i = 0;
		int result = 0;
		while(i < Name.length()){
			result = result + (int)Name.charAt(i);
			i++;
		}
		return result;
	}*/
	
	public String getName(){
		return this.Name;
	}
	public String getType(){
		return this.Type;
	}
	public int getCarryPoint(){
		return this.CarryPoint;
	}
	public String getHeroPosition(){
		switch(this.CarryPoint){
		case 5:
			return "This Hero is Hard Carry";
		case 4:
			return "This Hero is Mid Line Carry";
		case 3:
			return "This Hero is Offlane Hero";
		case 2:
			return "This Hero is Jungle or Carry Support";
		case 1:
			return "This Hero is Hard Support";
		
		}
		return null;
		
	}
	public boolean[] getAbility(){
		return this.Ability;
	}
	
	public boolean has_Push(){
		if(this.Ability[0] == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean has_AOE(){
		if(this.Ability[1] == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean has_Stun(){
		if(this.Ability[2] == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean has_Escape(){
		if(this.Ability[3] == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean has_SlowDown(){
		if(this.Ability[4] == true){
			return true;
		}
		else{
			return false;
		}
	}
	public void write_Hero(){
		System.out.println("Name: " + this.Name );
		System.out.println("Type: " + this.Type);
		System.out.println(this.getHeroPosition());
		System.out.println("Carry Point: " + this.CarryPoint);
		if(this.Ability[0] == true){
			System.out.println(this.Name + " has push ability");
		}
		if(this.Ability[1] == true){
			System.out.println(this.Name + " has AOE");
		}
		if(this.Ability[2] == true){
			System.out.println(this.Name + " has Stun");
		}
		if(this.Ability[3] == true){
			System.out.println(this.Name + " has Escape ability");
		}
		if(this.Ability[4] == true){
			System.out.println(this.Name + " has SlowDown");
		}
			
	}
	/*testing*/
	public static void main(String args[]){
		boolean [] test = {false,true,true,false,false};
		DotaHero EarthShaker = new DotaHero("EarthShaker",S,5,test);
		EarthShaker.write_Hero();
	}

}
