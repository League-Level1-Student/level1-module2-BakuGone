package _02_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {

		SeaCreature spongebob = new SeaCreature("Spongebob");
		SeaCreature squidward = new SeaCreature("Squidward");
		SeaCreature patrick = new SeaCreature("Patrick");
		
		System.out.println(spongebob.getName());
		System.out.println(patrick.getName());
		System.out.println(squidward.getName());

		spongebob.eat();
		squidward.eat();
		patrick.eat();
		spongebob.laugh();
		squidward.laugh();
		patrick.laugh();
	}

}
