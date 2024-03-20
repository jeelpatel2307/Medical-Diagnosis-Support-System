import java.util.Scanner;

public class MedicalDiagnosisSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("Welcome to the Medical Diagnosis Support System!");
        
        // Prompt user for symptoms
        System.out.println("Please enter your symptoms (comma-separated):");
        String symptoms = scanner.nextLine();
        
        // Perform diagnosis based on symptoms
        String diagnosis = performDiagnosis(symptoms);
        
        // Display diagnosis result
        System.out.println("Based on the symptoms provided, the possible diagnosis is: " + diagnosis);
        
        // Close scanner
        scanner.close();
    }
    
    // Method to perform diagnosis based on symptoms
    public static String performDiagnosis(String symptoms) {
        // Logic to determine diagnosis based on symptoms (dummy implementation)
        // In a real-world scenario, this logic would involve more sophisticated algorithms and possibly external data sources
        
        // Dummy implementation: Just return a fixed diagnosis for demonstration purposes
        return "Common Cold";
    }
}
