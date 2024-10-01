import org.junit.Assert;
import org.junit.Test;
import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {


    @Test
    public void shouldReturnCashback(){

        int amount = 800;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(expected,actual);
    }


}
