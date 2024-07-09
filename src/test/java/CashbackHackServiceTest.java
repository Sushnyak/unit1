import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {


    @Test
    void shouldReturnCashback(){

        int amount = 800;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual,expected);
    }


}
