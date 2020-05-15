package mooc.week4;

//Create a class Product that represents a product sold in a webshop. A product has a price,
//amount and name. A new class can be created as follows: Point at the project 073.Product
//in the projects tab and click the right mouse button. Then select new and java class.
//When a dialog opens, give the class the name Product.
//The class should have:
//A constructor public Product(String nameAtStart, double priceAtStart, int amountAtStart)
//A method public void printProduct() that prints a product in the following form:
//Banana, price 1.1, amount 13

public class Ex73_Product {

    public static void main(String[] args) {

        Product myProduct = new Product("banana", 1.1, 11);
        System.out.println(myProduct);
        myProduct.printProduct();
    }

    public static class Product {

        String nameAtStart;
        double priceAtStart;
        double amountAtStart;

        public Product(String nameAtStart, double priceAtStart, double amountAtStart) {
            this.nameAtStart = nameAtStart;
            this.priceAtStart = priceAtStart;
            this.amountAtStart = amountAtStart;
        }

        public void printProduct() {
            System.out.println(this.nameAtStart + ", price " + this.priceAtStart + ", amount "
                    + this.amountAtStart);
        }

        @Override
        public String toString() {
            return "Product{" +
                    "nameAtStart='" + nameAtStart + '\'' +
                    ", priceAtStart=" + priceAtStart +
                    ", amountAtStart=" + amountAtStart +
                    '}';
        }
    }
}
