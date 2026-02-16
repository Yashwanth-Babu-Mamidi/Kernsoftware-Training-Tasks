package feb16th;
public class FileExtension {
    public static void main(String[] args) {

        String fileName = "photo.png";
        String extension = fileName.substring(fileName.lastIndexOf('.') + 1);

        System.out.println("Extension: " + extension);
    }
}

