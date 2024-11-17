public class FileManager {
    private static FileManager instance;
    private static final String USER_CSV = "User.csv";
    private static final String ADMIN_CSV = "Admin.csv";

    private FileManager() {}

    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }

    public void writeToFile(String fileName, String content, boolean append) {
        try (FileWriter fw = new FileWriter(fileName, append);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readFromFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
} 