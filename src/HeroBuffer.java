
import java.util.HashSet;
import java.util.Iterator;

public class HeroBuffer{
	private HashSet<DotaHero> AllHero;
	private int Buffer_Size;
	
	/*test case*/
	public static final String S = "STRENGTH";
	public static final String A = "AGILITY";
	public static final String I = "INTELLIGENCE";
	static boolean [] PASED = {true,true,true,true,true};
	static boolean [] _AS__ = {false,true,true,false,false};
	
	static DotaHero EarthShaker = new DotaHero("EarthShaker",S,1,_AS__);
	static DotaHero b = new DotaHero("b",A,5,PASED);
	static DotaHero c = new DotaHero("b",A,5,PASED);
	
	public HeroBuffer(){
		this.AllHero = new HashSet<DotaHero>();
		this.Buffer_Size = 0;
	}
	public void addHero(DotaHero Hero){
		if(this.AllHero.contains(Hero) == false){
			Buffer_Size++;
		}
		this.AllHero.add(Hero);
		
	}
	public int addHeroToTeam(DotaHero Hero){
		if(Buffer_Size < 5){
			if(this.AllHero.contains(Hero) == true){
				return -1;
			}
			this.AllHero.add(Hero);
			return 1;
		}
		else{
			return -1;
		}
	}
	public static void main(String argv[]){
		HeroBuffer buffer = new HeroBuffer();
		buffer.addHero(EarthShaker);
		buffer.addHero(b);
		buffer.addHero(c);
		buffer.addHero(EarthShaker);
		Iterator<DotaHero> It = buffer.AllHero.iterator();
		
		
		It.next().write_Hero();
		It.next().write_Hero();
		It.next().write_Hero();
		System.out.println(buffer.Buffer_Size);
	}
	

}
