import java.awt.Desktop;
import java.net.URI;

public class GWD {
    public static void main(String[] args) {
        // Define the variables
        String name = "";
        String rollNo = "";
        String githubRepoLink = "";

        try {
            // Construct the title for the browser window
            String title = "Roll No: " + rollNo + " - Name: " + name;

            // Create a URI from the GitHub repository link
            URI uri = new URI(githubRepoLink);

            // Check if the Desktop class is supported on this platform
            if (Desktop.isDesktopSupported()) {
                // Get the Desktop instance and open the URI
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
                System.out.println("Opened GitHub repo with title: " + title);
            } else {
                System.out.println("Desktop not supported, cannot open browser.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
