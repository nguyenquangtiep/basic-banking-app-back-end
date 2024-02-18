package mark.asuradeva.banking.repository;

import mark.asuradeva.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
