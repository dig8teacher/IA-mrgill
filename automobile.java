import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class automobile {
	private String registration;
	private LocalDate purchaseDate;

	automobile(String registration, String purchaseDate) {
		System.out.println("auto constructor is executing...");
		this.registration = registration;
		this.purchaseDate = LocalDate.parse(purchaseDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

	}

	public String getRegistration() {
		return this.registration;
	}

	public int getAge () {
		LocalDate today = LocalDate.now();
		Period period = Period.between(this.purchaseDate, today);
		return period.getYears();
	}
	public static void main(String[] args) {
		automobile car = new automobile("vd-1234", "01/07/2010");
		System.out.println("ur car registration is "+car.getRegistration() );
		System.out.println("ur car is " + car.getAge() + " years old");
	}
}
