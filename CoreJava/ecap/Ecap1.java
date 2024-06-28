package CoreJava.ecap;


//Encapsulation says only 3 things;
// 1- All your data variable will be private
// 2- Use private instead of public
// 3- Use getter setter for security purpose


public class Ecap1 {
    public static void main(String[] args) {
        VWOLoginClass vwoLoginClass= new VWOLoginClass("Priti@gmail.com", "abc@123");
        vwoLoginClass.password= "New@123"; //If someone have reference then he can change my password
        System.out.println(vwoLoginClass.password);







       // boolean isLoggedIn= VWOLoginClass.isLoggedIn("Ankit", "A123");
        //System.out.println(isLoggedIn);




    }

}

class VWOLoginClass{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//below one is the parameterize constructor

    VWOLoginClass(String u, String p){
        this.username=u;
        this.password=p;
    }

    //Function
    boolean isLoggedIn(String username, String password){
        if (this.username.toLowerCase().equals(username) && this.password.equals(password)){
            System.out.println("Yes you are a valid user");
            return true;
        }else {
            System.out.println("Wrong user");
            return false;
        }
    }
}







