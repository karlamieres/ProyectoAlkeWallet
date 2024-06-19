package alkewallettest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import alkeWallet.User;
import alkeWallet.Wallet;

public class WalletTest {
    private Wallet wallet;
    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("1", "John Doe", "john.doe@example.com", 0);
        wallet = new Wallet(user);
    }

    @AfterEach
    public void tearDown() {
        // Aquí puedes limpiar recursos si es necesario
    }

    @Test
    public void testDeposit() {
        wallet.deposit(100, "USD");
        assertEquals(100, wallet.getBalance());
    }

    @Test
    public void testWithdraw() {
        wallet.deposit(100, "USD");
        wallet.withdraw(50, "USD");
        assertEquals(50, wallet.getBalance());
    }

    @Test
    public void testInsufficientFunds() {
        wallet.withdraw(50, "USD");
        assertEquals(0, wallet.getBalance());
    }
}
