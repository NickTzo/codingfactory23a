package gr.aueb.cf.ch7;

public class ReplaceStringApp {
    public static void main(String[] args) {
        String title = "Coding Factory";
        String dashedTitle;

        dashedTitle = title.replace(" ","-");
        System.out.print(dashedTitle);
    }
}
