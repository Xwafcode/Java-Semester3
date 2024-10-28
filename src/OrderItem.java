class OrderItem {
    MenuItem menuItem;
    int quantity;
    double totalPrice;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
        this.totalPrice = menuItem.price * quantity;
    }
}