/**
 * Created by M.Fakhreddin on 11/5/2016.
 */
public class Main {
    //static PrintStream out;

    public static void main(String argv[]) {
        String encodingName = "UTF-8";
        try {
            java.io.FileInputStream stream = new java.io.FileInputStream("EasyInput.txt");
//            java.io.FileInputStream stream = new java.io.FileInputStream("OkCompile//Input.txt");
            java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
            JLex lex = new JLex(reader);
            System.out.println(lex.yytext());
            YYParser parser = new YYParser(new JLex(reader));
            parser.parse();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found : ");
        } catch (java.io.IOException e) {
            System.out.println("IO error scanning file");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Unexpected exception");
            e.printStackTrace();
        }
    }
}
