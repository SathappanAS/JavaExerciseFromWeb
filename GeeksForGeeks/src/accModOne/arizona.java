package accModOne;

public class arizona {
	
	public String state;
	private String county;
	int population;
	protected String law;
	
	protected void test() {
		System.out.println("test");
	}

	
	
	public static void main(String[] args) {
		
		arizona a1=new arizona();
		a1.state="50thState  ";
		a1.county="Maricopa  ";
		a1.population=12345;
		a1.law="DL Law  ";
		
		System.out.println(a1.state + a1.county +a1.population + " " +a1.law);

	}

}
