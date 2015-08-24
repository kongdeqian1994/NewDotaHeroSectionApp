import java.util.HashSet;
import java.util.Iterator;


public class HeroTeam extends HeroBuffer {
	
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
	
	public int getTeam_Push_Point(){
		Iterator<DotaHero> It = this.AllHero.iterator();
		int result = 0;
		if(this.Buffer_Size == 5){
			while(It.hasNext()){
				if(It.next().has_Push()){
					result++;
				}
			}
			return result;
		}
		else{
			return -1;
		}
	}
	public int getTeam_AOE_Point(){
		Iterator<DotaHero> It = this.AllHero.iterator();
		int result = 0;
		if(this.Buffer_Size == 5){
			while(It.hasNext()){
				if(It.next().has_AOE()){
					result++;
				}
			}
			return result;
		}
		else{
			return -1;
		}
	}
	public int getTeam_Stun_Point(){
		Iterator<DotaHero> It = this.AllHero.iterator();
		int result = 0;
		if(this.Buffer_Size == 5){
			while(It.hasNext()){
				if(It.next().has_Stun()){
					result++;
				}
			}
			return result;
		}
		else{
			return -1;
		}
	}
	public int getTeam_Escape_Point(){
		Iterator<DotaHero> It = this.AllHero.iterator();
		int result = 0;
		if(this.Buffer_Size == 5){
			while(It.hasNext()){
				if(It.next().has_Escape()){
					result++;
				}
			}
			return result;
		}
		else{
			return -1;
		}
	}
	public int getTeam_SlowDown_Point(){
		Iterator<DotaHero> It = this.AllHero.iterator();
		int result = 0;
		if(this.Buffer_Size == 5){
			while(It.hasNext()){
				if(It.next().has_SlowDown()){
					result++;
				}
			}
			return result;
		}
		else{
			return -1;
		}
	}
	public static void main(String[] argv){
		HeroTeam buffer = new HeroTeam();
		buffer.addAllHero();
		buffer.writeAllHero_Name();
		System.out.println(buffer.getTeam_SlowDown_Point());
		
	}

}
