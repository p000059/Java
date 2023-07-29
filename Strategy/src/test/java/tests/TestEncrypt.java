package tests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import strategy.controllers.encryption.AesEncryptionStrategy;
import strategy.controllers.encryption.BlowfishEncryptionStrategy;
import strategy.interfaces.encryption.EncryptionStrategy;
import strategy.services.encrypt.Encryptor;

@SpringBootTest
class TestEncrypt {

	@Test
	public void testEncrypt() throws Exception {
		
		EncryptionStrategy aesStrategy = new AesEncryptionStrategy();
		Encryptor aesEncryptor = new Encryptor(aesStrategy, null);

		aesEncryptor.setPlainText("This is plain text");
		aesEncryptor.encrypt();

		EncryptionStrategy blowfishStrategy = new BlowfishEncryptionStrategy();
		Encryptor blowfishEncryptor = new Encryptor(blowfishStrategy, null);
		
		blowfishEncryptor.setPlainText("This is plain text");
		blowfishEncryptor.encrypt();
	}

}
