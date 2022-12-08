package chapter8;

public class PasswordValidator {
    public static void main (String args[]){
        String password = "Test1234*";
        String oldPassword = "Test1234*";
        String username = "sondos";

        if (eightCharLong(password) && containsUpperCase(password) &&
                containsSpecialChar(password) && !containsUsername(password , username)
                && !containsOldPassword(password ,oldPassword)){
            System.out.println("Password is valid");
        }else {
            System.out.println("Password isn't valid");
        }
    }

    public static boolean eightCharLong(String password){
        if(password.length() >= 8){
            return true;
        }else {
            return false;
        }
    }

    public static boolean containsUpperCase (String password){
        for (int i=0 ; i< password.length() ; i++){
            if (Character.isUpperCase(password.charAt(i))){
                return true;
            }

        }
        return false;
    }

    public static boolean containsSpecialChar( String password){
        for (int i=0 ; i<password.length() ; i++){
            if(! Character.isDigit(password.charAt(i) )
            && ! Character.isLetter(password.charAt(i))
            && ! Character.isWhitespace(password.charAt(i))){
                return true ;
            }
        }
        return false;
    }

    public static boolean containsUsername (String password , String username){
        if(password.contains(username)){
            return  true;
        }
        else {
            return false;
        }
    }

    public static boolean containsOldPassword (String password , String oldPassword){
        if(password.contentEquals(oldPassword)){
            return true;
        }
        return false;
    }
}
