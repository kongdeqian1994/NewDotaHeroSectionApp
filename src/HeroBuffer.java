
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

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
	/*test case*/
	
	/*need to read the HeroData.txt to get all Hero data to buffer*/
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
	
	public void addAllHero() {
		try{
			InputStream in = new FileInputStream(new File("HeroData.txt"));
		
			Scanner input = new Scanner(in);
		
			while(input.hasNext()){
				System.out.println(input.next());
			}
		}
		catch(Exception e){
			System.out.println("Do not try to modify the HeroData file's name, It will cause error");
		}
		
			
		
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
	
	public HeroBuffer find_STRENGTH_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	
	public HeroBuffer find_AGILITY_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	
	public HeroBuffer find_INTELLIGENCE_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	
	public HeroBuffer find_HardCarry_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	
	public HeroBuffer find_MidlineCarry_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	
	public HeroBuffer find_Offline_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	
	public HeroBuffer find_junglesupport_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	public HeroBuffer find_hardsupport_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	public HeroBuffer find_Push_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	public HeroBuffer find_AOE_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	public HeroBuffer find_Stun_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	public HeroBuffer find_Escape_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	public HeroBuffer find_SlowDown_Hero(){
		HeroBuffer result = new HeroBuffer();
			
		return result;
	}
	
	public static void main(String argv[]){
		HeroBuffer buffer = new HeroBuffer();
		/*buffer.addHero(EarthShaker);
		buffer.addHero(b);
		buffer.addHero(c);
		buffer.addHero(EarthShaker);
		Iterator<DotaHero> It = buffer.AllHero.iterator();
		
		
		It.next().write_Hero();
		It.next().write_Hero();
		It.next().write_Hero();
		System.out.println(buffer.Buffer_Size);*/
		buffer.addAllHero();
	}
	

}
