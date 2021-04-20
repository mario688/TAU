package lab3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AccountServiceMockTest {


    @Test
    void getAllActivateAccounts(){


        List<AccountWithCalculatedBmi> accounts = prepareAccountData();
        AccountRepository accountRepositoryMock = mock(AccountRepository.class);
        AccountService accountService = new AccountService(accountRepositoryMock);
        when(accountRepositoryMock.getAllAccounts()).thenReturn(accounts);

        List<AccountWithCalculatedBmi>accountList = accountService.getAllActivateAccounts();

        assertThat(accountList,hasSize(2));
    }
    @Test
    void getNoActivateAccounts(){



        AccountRepository accountRepositoryMock = mock(AccountRepository.class);
        AccountService accountService = new AccountService(accountRepositoryMock);
        when(accountRepositoryMock.getAllAccounts()).thenReturn(Arrays.asList());
        List<AccountWithCalculatedBmi>accountList = accountService.getAllActivateAccounts();
        assertThat(accountList,hasSize(0));
    }

    private List<AccountWithCalculatedBmi> prepareAccountData(){
        Address address = new Address("Dluga","34/12");
        Address address1 = new Address("Jesionowa","324/1");
        AccountWithCalculatedBmi account = new AccountWithCalculatedBmi();
        AccountWithCalculatedBmi account1 = new AccountWithCalculatedBmi(address);
        AccountWithCalculatedBmi account2 = new AccountWithCalculatedBmi(address1);

        return Arrays.asList(account,account1,account2);
    }


}
