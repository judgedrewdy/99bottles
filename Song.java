
public class Song {
	public static void main(String[] args) {
		int bottles;
		
		for(bottles = 99; bottles > 1; bottles--) {
			System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
			System.out.println("Take one down and pass it around, " + (bottles - 1) + " bottles of beer on the wall.\n");
		}
		System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
		System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
		
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");
		
		
	}
}
