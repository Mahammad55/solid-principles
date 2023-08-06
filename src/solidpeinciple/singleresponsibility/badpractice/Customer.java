package solidpeinciple.singleresponsibility.badpractice;

public class Customer {
    String name;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void saveToDataBase(){
        //  some codes
    }

    public void sendEmail(String message){
        // some codes
    }
}
