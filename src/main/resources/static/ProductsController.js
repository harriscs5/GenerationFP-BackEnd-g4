//ProductsController class
class ProductsController {
    // Set up the items and currentId property in the contructor
    constructor(currentId = 0) {
        this.products = [];
        this.currentId = currentId;
    }

    // Create the addItem method
    addItem(name, description, imageUrl, price, salePrice) {
        const product = {
            // Increment the currentId property
            id: this.currentId++,
            name: name,
            description: description,
            imageUrl: imageUrl,
            price: price,
            salePrice: salePrice
        };

        // Push the item to the items property
        this.products.push(product);
    }
}
