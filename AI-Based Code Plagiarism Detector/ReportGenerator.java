import java.io.FileWriter;

public class ReportGenerator {

    public static void generateReport(double similarity) {
        try {
            FileWriter writer = new FileWriter("report.txt");

            writer.write("Code Plagiarism Report\n");
            writer.write("----------------------\n");
            writer.write("Similarity: " + (similarity * 100) + "%\n");

            if(similarity > 0.7) {
                writer.write("Status: HIGH plagiarism detected\n");
            } else if(similarity > 0.4) {
                writer.write("Status: Moderate similarity\n");
            } else {
                writer.write("Status: Low similarity\n");
            }

            writer.close();
            System.out.println("Report generated: report.txt");

        } catch (Exception e) {
            System.out.println("Error writing report");
        }
    }
}