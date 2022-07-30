
public class AppChecker {

    public static void main(String[] args) {
        AndroidApp androidApp = new AndroidApp("Calculator");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("Calculato");
        iphoneApp.runIphoneApp();
        iphoneApp.appInfo();
    }
}
