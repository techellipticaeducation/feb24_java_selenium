package feb24_java_selenium;

public class ConditionStatementDemo {
	public static void main(String[] args) {
		// if else condition

		//	age > child adult
		//  age  <= 18 , child, else adult	

		// series = 0-18 = child, 19-30 = adult , 31-45 = Mature, >45 = Old	

		int age = 34;
		String ageGroup = "";
		if(age <= 18) {
			ageGroup  = "Child";
		}else if(age > 18  &&  age <=30) {
			ageGroup = "Adult";
		}else if(age > 30 && age <= 45) {
			ageGroup = "Mature";
		}else {
			ageGroup = "Old";
		}
		System.out.println(ageGroup);
	}
}
