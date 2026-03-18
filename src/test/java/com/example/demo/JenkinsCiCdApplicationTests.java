package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(JenkinsCiCdController.class)
class JenkinsCiCdApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void greetingsEndpoint() throws Exception {
        String name = "Basanta kumar hota";
        
        mockMvc.perform(get("/greetings/{name}", name))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello " + name + " Congratulations you have successfully completed Jenkins CI/CD demo !"));
    }
}