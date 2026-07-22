public class SystemInfo {
    public static void main(String[] args) {

        String javaVersion = System.getProperty("java.version");
        String os = System.getProperty("os.name");
        String user = System.getProperty("user.name");
        String arch = System.getProperty("os.arch");
        String dir = System.getProperty("user.dir");

        System.out.println("SYSTEM INFORMATION");
        System.out.println("Java Version: " + javaVersion);
        System.out.println("Operating System: " + os);
        System.out.println("User Name: " + user);
        System.out.println("Architecture: " + arch);
        System.out.println("Working Directory: " + dir);
    }
}