
public class Customer
{
	String customerName;
	Product[] products;
	private int productCount;
	public Customer(String customerName,int maxProduct) 
	{
		this.customerName=customerName;
		this.productCount=0;
		this.products = new Product[maxProduct];
	}
	public void addProduct(Product p) 
	{   
		if(productCount<products.length) {
			  products[productCount]= p;
			  productCount++;
		}else {
			System.out.println("Cart is full. Cannot add more product");
		}  
	}
    public void showBill() {
        System.out.println("Customer: " + customerName);
        System.out.println("===================");
        System.out.println("Purchased Products:\n");

        double totalAmount = 0;
        double totalDiscount = 0;

        for (int i = 0; i < productCount; i++) {
            Product p = products[i];
            p.displayDetails();
            double discountedPrice = p.getDiscountedPrice();
            double discount = p.getPrice() - discountedPrice;

            System.out.println("Discounted Price: " + discountedPrice +" rupees" + "\n");

            totalAmount += p.getPrice();
            totalDiscount += discount;
        }

        double totalPayable = totalAmount - totalDiscount;

        System.out.println("Total         Amount: " + totalAmount+" rupees");
        System.out.println("Total       Discount: " + totalDiscount+" rupees");
        System.out.println("Total Payable Amount: " + totalPayable+" rupees");
    }

}
