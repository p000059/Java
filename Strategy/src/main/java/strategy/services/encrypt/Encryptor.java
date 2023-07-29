package strategy.services.encrypt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strategy.interfaces.encryption.EncryptionStrategy;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Encryptor {

	private EncryptionStrategy strategy;
	private String plainText;

	public void encrypt() {
		strategy.encryptData(plainText);
	}
}

//Context
