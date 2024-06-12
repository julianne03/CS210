package groceryList;

public class GroceryList {
	public static final int MAX_ITEMS = 10;
	private GroceryItemOrder[] items;
	private int numItems;

	public GroceryList() {
		items = new GroceryItemOrder[MAX_ITEMS];
		numItems = 0;
	}

	public void add(GroceryItemOrder item) {
		items[numItems] = item;
		numItems++;
	}

	public double getTotalCost() {
		double cost = 0.0;
		for (int i = 0; i < numItems; i++) {
			cost += items[i].getCost();
		}
		return cost;
	}

	public void displayItems() {
		for (int i = 0; i < numItems; i++) {
			System.out.println(items[i].toString() + " " + items[i].getCost());
		}
	}
	
	public void reportShoppingList() {
		System.out.println("Items that is in shopping cart");
		System.out.println("------------------------------");
		displayItems();
		System.out.println("------------------------------");
		System.out.println("total: " + getTotalCost());
	}
	
}
