package shop.list;

public class Address {
		String area;
		String city;
		String pincode;

		public Address()
		{
			area = "Unknown";
			city = "Unknown";
			pincode = "Unknown";
		}

		public Address(String area , String city , String pincode)
		{
			this.area = area;
			this.city = city;
			this.pincode = pincode;
		}
		@Override
		public String toString() {
			return "Address [area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
		}

		public void Display()
		{
			System.out.println("Area = "+area+" City = "+city+" Pincode = "+pincode);
		}

	
}
