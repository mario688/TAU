package lab3;

import org.junit.jupiter.api.Test;

import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;


public class AccountServiceStubTest {

    @Test
    void getAllActivateAccounts(){

        //given
        AccountRepository accountRepositoryStub = new AccountRepositoryStub();
        AccountService accountService = new AccountService(accountRepositoryStub);

        //when
        List<AccountWithCalculatedBmi>accountList = accountService.getAllActivateAccounts();
        //then
        assertThat(accountList,hasSize(2));
    }



}
