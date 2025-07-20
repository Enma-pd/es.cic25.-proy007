package es.cic25.proy007;

import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


@SpringBootTest
@AutoConfigureMockMvc
class Proy007ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	//GET
	@Test
	void testGetCroquetas() throws Exception {
		mockMvc.perform(get("/croqueta"))
			.andDo(print())
			.andExpect(status().isOk())
			.andReturn();
	}

	@Test
	void testGetCroqueta() throws Exception {
		mockMvc.perform(get("/croqueta/1"))
			.andDo(print())
			.andExpect(status().isOk())
			.andReturn();
	}

	//POST
	
}
