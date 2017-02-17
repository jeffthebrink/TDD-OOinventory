import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


/**
 * Created by jeffbrinkley on 2/16/17.
 */
public class InventoryItemTest {

    @Test
    public void checkPassword() {
        assertFalse(Main.checkPassword("jeff"));
        assertTrue(Main.checkPassword("Jeff"));
        assertFalse(Main.checkPassword("Jeff_123"));
    }

    @Test
    public void checkInventoryPrint() {
        assertTrue(Main.itemArrayList.isEmpty()); // checks if inventory list is initialized as empty before populating
        Main.initializeInventoryList();
        assertTrue(Main.itemArrayList.get(0).item.equals("broad sword"));
    }


    @Test
    public void checkAddNewItemMethod() throws Exception {
        Main.createItem();
        assertTrue(Main.itemArrayList.get(0).item.contains("Huge Axe"));
    }

    @Test
    public void checkRemoveItemMethod() throws Exception {
        Main.createItem(); // create an item to be removed
        Main.removeItem();
        assertTrue(Main.itemArrayList.isEmpty()); // to see if the item has been removed
    }

    @Test
    public void checkUpdateItemMethod() throws Exception { // run update method and then assert true if it has changed
        Main.createItem(); // create an item to be edited
        Main.updateItem();
        assertTrue(Main.itemArrayList.get(0).itemQty == 8);

    }


}
