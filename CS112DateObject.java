public class CS112DateObject {
    
    // These are instance fields - each instance of CS112DateObject has
    // its own set

    private int day;
    private int year;
    private int month; //January = 1

    // you might find this array helpful

    private String[] months = {"January","February","March","April",
			       "May","June","July","August","September",
			       "October","November","December"};

    /*
     * Note: You must store the month as an int, and January must be 1
     * If you want to store the String month as well, you must be sure
     * that when the program changes one, it also changes the other.
     * */

    //constructor
    public CS112DateObject(String m, int d, int y) {
	setDate(m,d,y);
    }
    
    public void setDay(int d) {
	day = d;
    }

    public void setMonth(String m) {
	month = 1;
    }

    public void setYear(int y) {
	year = y;
    }

    public void setDate(String month, int day, int year) {
	setMonth(month);
	setDay(day);
	setYear(year);		
    }
}
