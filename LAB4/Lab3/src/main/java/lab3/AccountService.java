package lab3;

import java.util.List;
import java.util.stream.Collectors;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    List<AccountWithCalculatedBmi> getAllActivateAccounts(){
        return accountRepository.getAllAccounts().stream()
                .filter(AccountWithCalculatedBmi::isActive)
                .collect(Collectors.toList());
    }


}
