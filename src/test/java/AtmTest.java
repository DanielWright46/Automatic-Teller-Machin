import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AtmTest {
    @Test
    public void shouldHaveABalanceOf50(){
        //Arrange
        Atm underTest = new Atm(50, "1234");
        //Act
        int actualBalance = underTest.getBalance();
        //Assert
        assertThat(actualBalance, is(50));
    }

    @Test
    public void shouldHaveABalanceOf100(){
        Atm underTest = new Atm(100, "1234");
        int actualBalance = underTest.getBalance();
        assertThat(actualBalance, is(100));
    }

    @Test
    public void depositOf50ShouldIncreaseInitialBalanceOf50to100(){
        Atm underTest = new Atm(50, "1234");
        underTest.deposit(50);
        int actualBalance = underTest.getBalance();
        assertThat(actualBalance, is(100));
    }

    @Test
    public void depsotOf50ShouldIncreaseInitialBalanceof100to200(){
        Atm underTest = new Atm(100, "1234");
        underTest.deposit(100);
        int actualBalance = underTest.getBalance();
        assertThat(actualBalance, is(200));
    }

    @Test
    public void withdrawlOf50ShouldDecreaseInitialBalanceOf100To50(){
        Atm underTest = new Atm(100, "1234");
        underTest.withdrawl(50);
        int actualBalance = underTest.getBalance();
        assertThat(actualBalance, is (50));
    }

    @Test
    public void withdrawlOf100ShouldDecreaseInitialBalanceOf50By0(){
        Atm underTest = new Atm (50, "1234");
        underTest.withdrawl(100);
        int actualBalance = underTest.getBalance();
        assertThat(actualBalance, is(50));
    }
    @Test
    public void shouldAllowAccessWithCorrectPin(){
        Atm underTest = new Atm(50, "1234");
        boolean accessResult = underTest.accessAccount("1234");
        assertThat(accessResult, is(true));
    }
    @Test
    public void shouldDenyUserAccessWithIncorrectPin(){
        Atm undertest =  new Atm(50,"1234");
        boolean accessResult = undertest.accessAccount(("1111"));
        assertThat(accessResult, is(false));
    }
}
