import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a password to validate: ");
            String password = scanner.nextLine();
            
            if (isValidPassword(password)) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password is invalid.");
            }
        }
    }
    
    public static boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }
        
        int categoriesCount = 0;
        if (containsLowerCase(password)) {
            categoriesCount++;
        }
        if (containsUpperCase(password)) {
            categoriesCount++;
        }
        if (containsNumbers(password)) {
            categoriesCount++;
        }
        if (containsSpecialSymbols(password)) {
            categoriesCount++;
        }
        
        return categoriesCount >= 3;
    }
    
    public static boolean containsLowerCase(String password) {
        return password.matches(".*[a-z].*");
    }
    
    public static boolean containsUpperCase(String password) {
        return password.matches(".*[A-Z].*");
    }
    
    public static boolean containsNumbers(String password) {
        return password.matches(".*\\d.*");
    }
    
    public static boolean containsSpecialSymbols(String password) {
        return password.matches(".*[~!@#$%^&*()-=+_].*");
    }
}
