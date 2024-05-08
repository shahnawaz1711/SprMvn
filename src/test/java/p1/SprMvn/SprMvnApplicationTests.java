package p1.SprMvn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SprMvnApplicationTests {

	static Logger logger = LoggerFactory.getLogger(SprMvnApplication.class);
	@Test
	void contextLoads() {
		logger.info("SprMvnApplicationTests contextLoads STARTED.....");
		assertEquals(true, true);
	}

}
