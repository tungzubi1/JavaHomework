import org.assertj.core.error.ShouldContainOnlyDigits;
import org.junit.Assert;
import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class Execute {
    Script ex = new Script();
    private Object ShouldContainOnlyDigits;

    @Test
    public void CheckMail(){
        String mail ="tunglt22@onemount.com";
        assertThat(mail).containsPattern("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }

    @Test
    public void CheckCanNang(){
        String can = "69kg";
        assertThat(can).containsPattern("[0-9]"+"kg$");
    }

    @Test
    public void CheckCMND(){
        String[] SoCMND = new String[]{"123311911", "123132191", "123132191", "123121119", "123311119"};
        for (int i = 0; i < SoCMND.length; i++) {
            assertThat(SoCMND[i]).containsOnlyDigits()
                                 .hasSize(9)
                                 .isNotNull();
        }
    }
}
