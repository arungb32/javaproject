package cust;

public class Customer {

	public static void main(String[] args) {
				    private int customerId;
				    private String customerName;

				    // Constructor to set all variables
				    public Customer(int customerId, String customerName) {
				        this.customerId = customerId;
				        this.customerName = customerName;
				    }

				    // Getter for customerId
				    public int getCustomerId() {
				        return customerId;
				    }

				    // Setter for customerId
				    public void setCustomerId(int customerId) {
				        this.customerId = customerId;
				    }

				    // Getter for customerName
				    public String getCustomerName() {
				        return customerName;
				    }

				    // Setter for customerName
				    public void setCustomerName(String customerName) {
				        this.customerName = customerName;
				    }

				    // Display method (optional)
				    public void displayCustomerInfo() {
				        System.out.println("Customer ID: " + customerId);
				        System.out.println("Customer Name: " + customerName);
				    }

				    // Main method to test the Customer class
				    public static void main(String[] args) {
				        Customer Customer = new Customer(101, "Alice");
				        Customer.displayCustomerInfo();
				        
				        // Update customer info
				        Customer.setCustomerId(102);
				        Customer.setCustomerName("Bob");
				        System.out.println("\nUpdated Customer Info:");
				        Customer.displayCustomerInfo();
				    }

			}


	}

}
