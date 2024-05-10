import java.math.BigInteger;

public class DiffieHellman {
    public static void main(String[] args) {
        // Define prime number and base
        BigInteger n = new BigInteger("15");
        BigInteger g = new BigInteger("12");

        // Define secrets chosen by both parties
        BigInteger secretA = new BigInteger("44");
        BigInteger secretB = new BigInteger("80");

        // Calculate public keys for both parties
        BigInteger publicKeyA = g.modPow(secretA, n);
        BigInteger publicKeyB = g.modPow(secretB, n);

        // Calculate shared secret for both parties
        BigInteger sharedSecretA = publicKeyB.modPow(secretA, n);
        BigInteger sharedSecretB = publicKeyA.modPow(secretB, n);

        // Print the calculated shared secrets
        System.out.println("Shared secret for user1: " + sharedSecretA);
        System.out.println("Shared secret for user2: " + sharedSecretB);
    }
}
