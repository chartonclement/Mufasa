
public class bankAccount {
	private String StreetAddress;
	private String City;
	private String PostalCode;
	private String Country;
	private String Password;
	private String HolderName;
	private typeofcard TypeofCard;
	private String CardNumber;
	private String Expirydate;
	public bankAccount(String streetAddress, String city, String postalCode, String country, String password,
			String holderName, typeofcard typeofCard, String cardNumber, String expirydate) {
		
		this.setStreetAddress(streetAddress);
		this.setCity(city);
		this.setPostalCode(postalCode);
		this.setCountry(country);
		this.setPassword(password);
		this.setHolderName(holderName);
		this.TypeofCard=typeofCard;
		this.setCardNumber(cardNumber);
		this.setExpirydate(expirydate);
	}
	public String getStreetAddress() {
		return StreetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		StreetAddress = streetAddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getHolderName() {
		return HolderName;
	}
	public void setHolderName(String holderName) {
		HolderName = holderName;
	}
	public typeofcard getTypeofCard() {
		return TypeofCard;
	}
	public void setTypeofCard(typeofcard typeofCard) {
		TypeofCard = typeofCard;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getExpirydate() {
		return Expirydate;
	}
	public void setExpirydate(String expirydate) {
		Expirydate = expirydate;
	}
	
}
