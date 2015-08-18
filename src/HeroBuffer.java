import java.util.ArrayList;

public class HeroBuffer{
	private ArrayList<DotaHero> AllHero;
	private int Buffer_Size;
	
	/*test case*/
	public static final String S = "STRENGTH";
	public static final String A = "AGILITY";
	public static final String I = "INTELLIGENCE";
	static boolean [] PASED = {true,true,true,true,true};
	static boolean [] _AS__ = {false,true,true,false,false};
	
	static DotaHero EarthShaker = new DotaHero("EarthShaker",S,1,_AS__);
	static DotaHero b = new DotaHero("b",A,5,PASED);
	
	public HeroBuffer(){
		this.AllHero = new ArrayList<DotaHero>();
		this.Buffer_Size = 0;
	}
	public int addHero(DotaHero Hero){
		if(Buffer_Size < 5){
			this.AllHero.add(Hero);
			Buffer_Size++;
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
		buffer.addHero(b);
		buffer.addHero(b);
		buffer.addHero(b);
		buffer.addHero(b);
		buffer.addHero(b);
		buffer.AllHero.get(0).write_Hero();
		System.out.println(buffer.Buffer_Size);
	}
	

}
