package groceryList;

public class GroceryStoreShoppingList {

	public static void main(String[] args) {
		
		GroceryList groceryList = new GroceryList();
		
		// Create grocery object items;
		GroceryItemOrder macbook = new GroceryItemOrder("Macbook", 2, 389.45);
		GroceryItemOrder notebook = new GroceryItemOrder("Notebook", 3, 5.5);
		
		// Add the grocery items to the grocery list;
		groceryList.add(macbook);
		groceryList.add(notebook);
		
		// Generate a report of the grocery list including item descriptions, prices and total price.
		groceryList.reportShoppingList();
	}

}
