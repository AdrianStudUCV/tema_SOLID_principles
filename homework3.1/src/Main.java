import java.io.FileWriter;
import java.io.IOException;

class FirstDegreeEquationSolver {

    public static void saveAsJson(String type, Double solution, String message) {
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  \"type\": \"" + type + "\",\n");
        if (solution != null) {
            json.append("  \"solution\": " + solution + ",\n");
        } else {
            json.append("  \"solution\": null,\n");
        }
        json.append("  \"message\": \"" + message + "\"\n");
        json.append("}");

        try (FileWriter file = new FileWriter("rezolvare_ecuatie.json")) {
            file.write(json.toString());
            System.out.println("Fișierul JSON a fost salvat cu succes.");
        } catch (IOException e) {
            System.out.println("Eroare la salvarea fișierului JSON.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // Exemplu: ax + b = 0
        double a = 0;
        double b = 3;

        String type;
        Double solution = null;
        String message;

        if (a != 0) {
            solution = -b / a;
            type = "unique";
            message = "Ecuația are o soluție unică.";
        } else if (b == 0) {
            type = "infinite";
            message = "Ecuația are o infinitate de soluții.";
        } else {
            type = "none";
            message = "Ecuația nu are soluții.";
        }

        saveAsJson(type, solution, message);
    }
}