class Product {
    int productId;
    String name;

    Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    void displayProduct() {
        System.out.println("Product List");
        System.out.println("Product ID: " + productId);
        System.out.println("Name = " + name);
    }
}

class Electronics extends Product {
    String brand;
    String model;
    String specification;

    Electronics(int productId, String name, String brand, String model,
                String specification) {
        super(productId, name);
        this.brand = brand;
        this.model = model;
        this.specification = specification;
    }

    void displayElectronics() {
        System.out.println("Electronics List");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Specification: " + specification);
    }
}

class Clothes extends Product {
    String size;
    String color;
    String material ;
    String price;

    Clothes(int productID , String name , String size , String color ,String material , String price){
        super(productID, name);
        this.size = size;
        this.color = color;
        this.material = material;
        this.price = price;
    }
    void displayClothes() {
        System.out.println("Clothes List");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
    }
}

class Main {
    public static void main(String[] args) {
        Electronics e1 = new Electronics(101, "smartphone", "Samsung",
                "Galaxy S21", "128GB, 8GB RAM");
        e1.displayProduct();
        e1.displayElectronics();

        Clothes c1 = new Clothes(201, "T-Shirt", "M", "Blue", "Cotton", "$20");
        c1.displayProduct();
        c1.displayClothes();
    }
}
