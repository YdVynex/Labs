package hiets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
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
    @Test
    void testCaptureArgsWithCaptor(){
        ArgumentCaptor<String> arg = ArgumentCaptor.forClass(String.class);
        doNothing().when(mockAccountManager).setString(arg.capture());
        mockAccountManager.setString("2fgsf");
        System.out.println(arg.getValue());
    }
    @Test
    void testerino(){
        ArgumentCaptor<String> arg =  ArgumentCaptor.forClass(String.class);
        doNothing()
                .when(mockAccountManager).setString(arg.capture());
        mockAccountManager.setString("b");
        System.out.println(arg.getValue());
    }

    @Captor ArgumentCaptor<String> arg;
    @Test
    void testerino2(){
        doNothing()
                .when(mockAccountManager).setString(arg.capture());
        mockAccountManager.setString("c");
        System.out.println(arg.getValue());
    }
}