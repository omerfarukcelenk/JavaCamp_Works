
public class CampCard {
	
	public CampCard(int percent) {
		System.out.println(this.percent + "Tamamlandý");
	}
	
	
	public CampCard(int id,String campeEplanation,String campInstructor,int percent) {
		this.id = id;
		this.campeEplanation = campeEplanation;
		this.campInstructor = campInstructor;
		this.percent = percent;
		
		
	}
	
	int id;
	String campeEplanation;
	String campInstructor;
	int percent;
	
	
	
}
