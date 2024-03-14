package feb24_java_selenium;

public class SwitchDemo {
	// Switch only use for equality comparison
	
	public static void main(String[] args) {

		String dayName = "MON";
		int dayNumber= -1;
		
		switch (dayName) {
		case "Monday":
		case "Mon":
		case "MON":
		case "monday":
		case "MONDAY":
			dayNumber = 1;
			break;
		case "Tuesday":
			dayNumber = 2;
			break;
		case "Wednesday":
			dayNumber = 3;
			break;
		default:
			dayNumber = -2;	
			
		}
		System.out.println(dayNumber);
	}
	
	
	
	
}
