public class Main {

	public static void main(String[] args) {
		
		CampCard campcard1 = new CampCard(1, "Java / React", "Engin Demiro�" , 32);
		CampCard campcard2 = new CampCard(2, "C# / ANGULAR", "Engin Demiro�" , 100);
		CampCard campcard3 = new CampCard(3, "Temel", "Engin Demiro�" , 0);
		
		
		CampCard[] campCards = {campcard1,campcard2,campcard3};
		
		for (CampCard campCard : campCards) {
			System.out.println(campCard.campeEplanation);
			System.out.println(campCard.campInstructor);
			System.out.println(campCard.percent);
		}
		
		
		CampCardManager campCardManager1 = new CampCardManager();
		campCardManager1.GoToClass(campcard2);
		CampCardManager campCardManager2 = new CampCardManager();
		campCardManager2.GoToCampInstructor(campcard1);
		
	}

}
