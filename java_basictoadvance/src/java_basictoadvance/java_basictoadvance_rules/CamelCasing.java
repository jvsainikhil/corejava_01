package java_basictoadvance.java_basictoadvance_rules;

public class CamelCasing {
	public static void main(String[] args) {
        System.out.println("🐫 What is Camel Case in Java?");
        System.out.println("CamelCase is a naming convention where each word starts with a capital letter, except the first word (in lowerCamelCase).");

        System.out.println("\n📦 Naming Conventions:");

        System.out.println("Type\t\tConvention\t\t\tExample");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Variable\tlowerCamelCase\t\t\tcustomerName");
        System.out.println("Method\t\tlowerCamelCase\t\t\tcalculateTotalAmount()");
        System.out.println("Class\t\tUpperCamelCase\t\t\tCamelCaseExample");
        System.out.println("Interface\tUpperCamelCase\t\t\tDataProcessor");
        System.out.println("Constant\tUPPER_SNAKE_CASE\t\tMAX_VALUE");
        System.out.println("Package\t\tlower.case\t\t\tcom.company.project");
        System.out.println("Enum\t\tUpperCamelCase\t\t\tDayOfWeek");
        System.out.println("Enum Const\tUPPER_SNAKE_CASE\t\tMONDAY");

        System.out.println("\n📝 Descriptions:");
        System.out.println("- Variable & Method: Start with lowercase, capitalize each next word.");
        System.out.println("- Class & Interface: Capitalize the first letter of each word.");
        System.out.println("- Constant & Enum Constants: Use all uppercase letters with underscores.");
        System.out.println("- Package: All lowercase, use dots to separate components.");
        
        // Optional bold-style summary for supported terminals
        System.out.println("\n\033[1mSummary:\033[0m");
        System.out.println("✔ Use camel case for readability and standardization.");
        System.out.println("✔ Avoid underscores in variables/methods (except in constants).");
        System.out.println("✔ Follow Java standards to keep code clean and professional.");

        System.out.println("\n🔎 Explanation:");
        System.out.println("- lowerCamelCase: First word lowercase, following words capitalized.");
        System.out.println("- UpperCamelCase: Every word starts with a capital letter.");

        System.out.println("\n💡 Why Use Camel Case?");
        System.out.println("- Improves readability");
        System.out.println("- Makes code consistent and clean");
        System.out.println("- Follows Java naming standards");

        System.out.println("\n❌ Bad Examples:");
        System.out.println("- Variable: Customer_name (uses underscore, not camel case)");
        System.out.println("- Class: customerclass (should be CustomerClass)");

        // ANSI bold formatting — works in supported terminals
        System.out.println("\033[1mSummary:\033[0m");
        System.out.println("Use camel case for naming in Java:");
        System.out.println("- Classes: UpperCamelCase → e.g., CamelCaseExample");
        System.out.println("- Variables and Methods: lowerCamelCase → e.g., customerName, calculateTotal()");
    }
}
