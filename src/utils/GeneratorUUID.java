package utils;

import java.util.UUID;

public class GeneratorUUID {

	public static String getRandomUUID(){
		// ex.) xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx :37자리
		UUID uuid = UUID.randomUUID();
		return String.valueOf(uuid);
	}
}
