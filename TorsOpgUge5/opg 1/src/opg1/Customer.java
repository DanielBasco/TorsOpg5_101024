package opg1;

public class Customer {

     private String firstName;
     private String lastName;
     private String username;
     private int id;
     private static int counter;
     private String toString;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter++;
        this.id = counter;

    }
    public String toString(){
        toString = "Navn: " + firstName + " " + lastName + "\n"+"Brugernavn: " +username + " |"+"ID: "+ id + "\n";
        return toString;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
         this.lastName = lastName;
    }
    public void setUsername(String username){
         this.username = username;
    }

    public String getFirstName() {
         return firstName;
    }
    public String getLastName() {
         return lastName;
    }
    public String getUsername() {
         return username;
    }


}
