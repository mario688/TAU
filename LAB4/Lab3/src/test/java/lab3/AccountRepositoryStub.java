package lab3;

import java.util.Arrays;
import java.util.List;

public class AccountRepositoryStub implements AccountRepository{

    @Override
    public List<AccountWithCalculatedBmi> getAllAccounts() {
        Address address = new Address("Dluga","34/12");
        Address address1 = new Address("Jesionowa","324/1");
        AccountWithCalculatedBmi account = new AccountWithCalculatedBmi();
        AccountWithCalculatedBmi account1 = new AccountWithCalculatedBmi(address);
        AccountWithCalculatedBmi account2 = new AccountWithCalculatedBmi(address1);

        return Arrays.asList(account,account1,account2);
    }
}
