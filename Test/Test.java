import javax.smartcardio.CommandAPDU;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void invoker(){
        Son f = new Son();
        HashMap map  = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args){
        invoker();
    }
}
