package H.iets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BankTest {
    @Mock
    private AccountManager mockAccountManager;

    @InjectMocks
    private Bank sut = new Bank("MijnEigenBank");

    @BeforeEach
    void setUp() {
        //sut = new Bank("MijnEigenBank");
        //mockAccountManager = mock(AccountManager.class);
        //sut.setAccounts(mockAccountManager);
    }

    @Test
    void testIfAccountHasBeenAdded() {
        when(mockAccountManager.add(any())).thenReturn(true);
        sut.setBankAccount(5, 10, 2);
        verify(mockAccountManager).add(any());
    }
}