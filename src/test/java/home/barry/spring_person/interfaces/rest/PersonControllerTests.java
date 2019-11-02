package home.barry.spring_person.interfaces.rest;

import home.barry.spring_person.services.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@RunWith(SpringRunner.class)
@WebMvcTest(PersonController.class)
public class PersonControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    PersonService personService;

    @Test
    public void testCreateUserController() throws Exception{

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .post("/add/")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8).content("hello world")).andReturn();
    }

    @Test
    public void contextLoads() {
    }

}