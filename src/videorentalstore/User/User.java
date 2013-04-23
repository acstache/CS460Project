package videorentalstore.User;

/**
*
* @author wacheson
*/
public class User {
    private String firstName, lastName, email, password, birthday, creditCardNum, creditCardExpireDate, address, city, state, zipCode;
    private int customerID;
    
    public User(String firstName, String lastName, String email, String password, String birthday,
            String creditCardNum, String creditCardExpireDate, String address, String city, String state, String zipCode)
    {
        setCustomerID(customerID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        setBirthday(birthday);
        setCreditCardNum(creditCardNum);
        setCreditCardExpireDate(creditCardNum);
        setAddress(address);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
    }
    
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
    
    public void setZipCode(String zipCode){
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
    
    public String getBirthday() {
        return birthday;
    }
    
    public String getCCNum() {
        return creditCardNum;
    }
    
    public String getCCExpDate() {
        return creditCardExpireDate;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }
    
    public String getZipCode() {
        return zipCode;
    }
}