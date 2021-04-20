package lab3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.core.IsEqual.equalTo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountWithCalculatedBmiTest {
    AccountWithCalculatedBmi newAccountWithCalculatedBmi = new AccountWithCalculatedBmi();
    @Test
    public void checkNewAccountIsNotActive(){

        assertThat(newAccountWithCalculatedBmi.isActive()).isFalse();
    }
    @Test
    public void checkActivatedAccount(){
        newAccountWithCalculatedBmi.activateAccount();
        assertTrue(newAccountWithCalculatedBmi.isActive());

    }
    @Test
    public void checkBmiWhenAccountIsActiveHamcrestTest(){
        AccountWithCalculatedBmi accountWithCalculatedBmi = new AccountWithCalculatedBmi(190,90);
        accountWithCalculatedBmi.activateAccount();
        assertThat(accountWithCalculatedBmi.CalculateBmi(accountWithCalculatedBmi), equalTo(24.93074792243767));

    }
    @Test
    public void checkBmiWhenAccountIsNotActiveHamcrestTest(){
        AccountWithCalculatedBmi accountWithCalculatedBmi = new AccountWithCalculatedBmi(190,90);
        assertThat(accountWithCalculatedBmi.isActive(), is(false));
        assertThat(accountWithCalculatedBmi.CalculateBmi(accountWithCalculatedBmi), equalTo(0.0));

    }



}
