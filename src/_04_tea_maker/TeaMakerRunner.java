package _04_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {

		Kettle x = new Kettle();
		TeaBag y = new TeaBag("Green");
		Cup z = new Cup();

		
		x.getWater();
		x.boil();
		
		z.makeTea(y, x.);
	}

}
