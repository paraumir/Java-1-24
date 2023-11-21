interface Order {
    boolean addPosition(Item item);
    boolean removePosition(String itemName);
    int removeAllPositions(String itemName);
    int getTotalItems();
    Item[] getItems();
    double getTotalCost();
    int getItemsCount(String itemName);
    String[] getDistinctItemNames();
    Item[] getSortedItemsByCostDesc();
}
