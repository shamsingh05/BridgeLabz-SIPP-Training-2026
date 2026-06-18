public class PasswordStrengthChecker {
    static void checkPassword(String password){
        try{
            if(password==null) throw new NullPointerException();
            if(password.isEmpty()) throw new IllegalArgumentException("Empty password");
            if(password.length()<8) throw new IllegalArgumentException("Minimum 8 chars required");
            if(!Character.isUpperCase(password.charAt(0))) throw new IllegalArgumentException("First character must be uppercase");
            if(!Character.isDigit(password.charAt(password.length()-1))) throw new IllegalArgumentException("Last character must be digit");
            if(!password.matches(".*[@#$%&*].*")) throw new IllegalArgumentException("Special character required");
            System.out.println("Strong password");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}