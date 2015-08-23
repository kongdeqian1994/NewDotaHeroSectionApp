import java.util.HashSet;


public class HeroTeam extends HeroBuffer {
	private HashSet<DotaHero> AllHero;
	private int Buffer_Size;
	
	public HeroTeam(){
		this.AllHero = new HashSet<DotaHero>();
		this.Buffer_Size = 0;
	}

	public int addHeroToTeam(DotaHero Hero){
		if(Buffer_Size < 5){
			if(this.AllHero.contains(Hero) == true){
				return -1;
			}
			this.AllHero.add(Hero);
			this.Buffer_Size++;
			return 1;
		}
		else{
			return -1;
		}
	}
	public static void main(String[] argv){
		HeroTeam buffer = new HeroTeam();
		
	}

}
