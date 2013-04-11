package videorentalstore.User;

/**
*
* @author wacheson
*/
public class User {
    private String firstName, lastName, email, password, birthday, creditCardNum, creditCardExpireDate, address, city, state;
    private int customerID;
    private Integer zipCode;
    
    public User(int customerID, String firstName, String lastName, String email, String password, String birthday,
            String creditCardNum, String creditCardExpireDate, String address, String city, String state, Integer zipCode)
    {
        setCustomerID(customerID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        if (birthday != null)
            setBirthday(birthday);
        if (creditCardNum != null)
            setCreditCardNum(creditCardNum);
        if (creditCardExpireDate != null)
            setCreditCardExpireDate(creditCardNum);
        if (address != null)
            setAddress(address);
        if (city != null)
            setCity(city);
        if (state != null)
            setState(state);
        if (zipCode != null)
            setZipCode(zipCode);
            
        
    }
    public User(int customerID, String firstName, String lastName, String email, String password)
    {
        setCustomerID(customerID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
               
    }
    
    //*****************not sure about this one because doesn't the database set this when a user is added to the database? - Will
    // This should be automatically incremented as users are added to the database, but we'll need to be able to get the number for adding it to
    // the rentals table - Brian
    public void setCustomerID (int customerID){
        this.customerID = customerID;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    
    public void setCreditCardNum(String creditCardNum){
        this.creditCardNum = creditCardNum;
    }
    
    public void setCreditCardExpireDate(String creditCardExpireDate){
        this.creditCardExpireDate = creditCardExpireDate;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setState(String state){
        this.state = state;
    }
    
    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }
    
    public int getCustomerID(){
        return customerID;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }   
}