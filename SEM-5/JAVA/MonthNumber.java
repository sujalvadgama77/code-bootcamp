class MonthNumber {
	static String nameofMonth(String month) {
		if(month.equals("01")) {
			return "January";
		} 
		else if(month.equals("02")) {
			return "February";
		} 
		else if(month.equals("03")) {
			return "March";
		} 
		else if(month.equals("04")) {
			return "April";
		} 
		else if(month.equals("05")) {
			return "May";
		} 
		else if(month.equals("06")) {
			return "June";
		} 
		else if(month.equals("07")) {
			return "July";
		} 
		else if(month.equals("08")) {
			return "August";
		} 
		else if(month.equals("09")) {
			return "September";
		} 
		else if(month.equals("10")) {
			return "October";
		} 
		else if(month.equals("11")) {
			return "November";
		} 
		else if(month.equals("12")) {
			return "December";
		} 
		else {
			return "Illegal";
		}
	}
	public static void main(String[] args) {
		String array[] = {"30-10-2019", "27-07-2022", "14-01-2004", "09-08-2021", "24-08-2023", "17-01-2019", "01-07-2022", "10-12-2000", "25-11-2021", "26-09-2020"};

		System.out.println("\n----Date with Month's Name-----");
		System.out.println("\nArbitary String Array : \n");
		for(int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}

		System.out.println("\nModified Date : \n");
		for(int i = 0; i < 10; i++) {
			String month = array[i].substring(3, 5);
			String res = nameofMonth(month);
			if(!res.equals("Illegal")) {
				System.out.println(array[i].substring(0, 2) + " " + res + " " + array[i].substring(6, 10));
			} else {
				System.out.println("\n\nInvalid Input");
				break;
			}
		}
	}
}
