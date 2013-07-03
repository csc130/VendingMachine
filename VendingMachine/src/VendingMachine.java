import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class VendingMachine {
	final int SIZE = 10;
	private Dispenser[] dispenser = new Dispenser[SIZE];
	private String machineID;
	private boolean status;
	private FoodInfo food;
	private String itemName;
	private BigDecimal price;
	private String nutriFacts;
	private String itemType;
	private int quantity;

	public VendingMachine() {
		readInventoy();
	}

	private void readInventoy() {
		// TODO Auto-generated method stub
		String fileName = "inventory1.txt";
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.err.print("Cannot open the file!");
			System.exit(0);
		}
		String line[] = new String[SIZE*5];
		int numItem = 0;
		int i = 0, j = 0;
		while (fileInput.hasNextLine()) {
			line[i] = fileInput.nextLine();
			i++;
		}

		numItem = ((i + 1) / 5);

		while (numItem > 0) {
			itemName = line[(5 * numItem) - 5];
			price = new BigDecimal(line[(5 * numItem) - 4]);
			nutriFacts = line[(5 * numItem) - 3];
			itemType = line[(5 * numItem) - 2];
			quantity = Integer.parseInt(line[(5 * numItem) - 1]);
			food = new FoodInfo(price, itemName, nutriFacts, itemType);
			dispenser[numItem - 1] = new Dispenser(quantity, food);
			System.out.println(food + " " + "Quantity " + dispenser[numItem-1].getQuantity());
			numItem--;

		}
		// System.out.println(line[i]);

		/*
		 * itemName = line[0]; price = new BigDecimal(line[1]); nutriFacts =
		 * line[2]; itemType = line[3]; quantity = Integer.parseInt(line[4]);
		 */

	}
}
