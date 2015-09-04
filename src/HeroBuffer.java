
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HeroBuffer{
	protected HashSet<DotaHero> AllHero;
	protected int Buffer_Size;
	
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
	
	public Iterator<DotaHero> get_It(){
		
		return this.AllHero.iterator();
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
				String name = new String(input.next());
				String type = new String(input.next());
				int carrypoint = input.nextInt();
				int push = input.nextInt();
				int aoe = input.nextInt();
				int stun = input.nextInt();
				int escape = input.nextInt();
				int slowdown = input.nextInt();
				if(type.equals("S")){
					type = new String("STRENGTH");
				}
				else if(type.equals("A")){
					type = new String("AGILITY");
				}
				else if(type.equals("I")){
					type = new String("INTELLIGENCE");
				}
				boolean [] ability = new boolean[5];
				if(push == 1){
					ability[0] = true; 
				}
				else{
					ability[0] = false;
				}
				if(aoe == 1){
					ability[1] = true; 
				}
				else{
					ability[1] = false;
				}
				if(stun == 1){
					ability[2] = true; 
				}
				else{
					ability[2] = false;
				}
				if(escape == 1){
					ability[3] = true; 
				}
				else{
					ability[3] = false;
				}
				if(slowdown == 1){
					ability[4] = true; 
				}
				else{
					ability[4] = false;
				}
				this.AllHero.add(new DotaHero(name,type,carrypoint,ability));
				this.Buffer_Size++;
			}
			input.close();
		}
		catch(Exception e){
			
			System.out.println("Do not try to modify the HeroData file's name or file's format, It will cause error");
		}				
	}
	
	public int get_BufferSize(){
		return this.Buffer_Size;
	}
	public void writeAllHero(){
		Iterator<DotaHero> it = this.AllHero.iterator();
		while(it.hasNext()){
			it.next().write_Hero();
		}
	}
	
	public void writeAllHero_Name(){
		Iterator<DotaHero> it = this.AllHero.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
	}
	
	
	public HeroBuffer find_STRENGTH_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.getType().equals("STRENGTH")){
				result.addHero(current);
			}
		}
		return result;
	}
	
	public HeroBuffer find_AGILITY_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.getType().equals("AGILITY")){
				result.addHero(current);
			}
		}	
		return result;
	}
	
	public HeroBuffer find_INTELLIGENCE_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.getType().equals("INTELLIGENCE")){
				result.addHero(current);
			}
		}		
		return result;
	}
	
	public HeroBuffer find_HardCarry_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.getCarryPoint() == 5){
				result.addHero(current);
			}
		}	
		return result;
	}
	
	public HeroBuffer find_MidlineCarry_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.getCarryPoint() == 4){
				result.addHero(current);
			}
		}		
		return result;
	}
	
	public HeroBuffer find_Offline_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.getCarryPoint() == 3){
				result.addHero(current);
			}
		}		
		return result;
	}
	
	public HeroBuffer find_junglesupport_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.getCarryPoint() == 2){
				result.addHero(current);
			}
		}		
		return result;
	}
	public HeroBuffer find_hardsupport_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.getCarryPoint() == 1){
				result.addHero(current);
			}
		}		
		return result;
	}
	public HeroBuffer find_Push_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.has_Push() == true){
				result.addHero(current);
			}
		}		
		return result;
	}
	public HeroBuffer find_AOE_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.has_AOE() == true){
				result.addHero(current);
			}
		}	
		return result;
	}
	public HeroBuffer find_Stun_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.has_Stun() == true){
				result.addHero(current);
			}
		}	
		return result;
	}
	public HeroBuffer find_Escape_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.has_Escape() == true){
				result.addHero(current);
			}
		}	
		return result;
	}
	public HeroBuffer find_SlowDown_Hero(){
		HeroBuffer result = new HeroBuffer();
		Iterator<DotaHero> It = this.AllHero.iterator();
		DotaHero current;
		while(It.hasNext()){
			current = It.next();
			if(current.has_SlowDown() == true){
				result.addHero(current);
			}
		}	
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
		//buffer.writeAllHero_Name();
		buffer.find_STRENGTH_Hero().writeAllHero_Name();
	}
	

}
