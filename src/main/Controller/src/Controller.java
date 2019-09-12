import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Controller {
    private static final Logger log = LogManager.getLogger(Model.class);

    public static void main(String[] args){
        log.log(Level.INFO, "Hello World!");
    }
}
