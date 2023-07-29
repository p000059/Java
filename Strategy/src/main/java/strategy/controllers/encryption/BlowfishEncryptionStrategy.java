package strategy.controllers.encryption;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import strategy.interfaces.encryption.EncryptionStrategy;

public class BlowfishEncryptionStrategy implements EncryptionStrategy {

	@Override
	public void encryptData(String plainText) {

		try {

			KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
			keyGenerator.init(128);

			SecretKey secretKey = keyGenerator.generateKey();
			byte[] plaintTextByteArray = plainText.getBytes("UTF8");

			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] cipherText = cipher.doFinal(plaintTextByteArray);

			for (int i = 0; i < cipherText.length; i++) {
				
				System.out.print(cipherText[i] + " ");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
