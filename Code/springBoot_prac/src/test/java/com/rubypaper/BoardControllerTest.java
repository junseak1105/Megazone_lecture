package com.rubypaper;

import com.rubypaper.controller.BoardController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class BoardControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BoardController boardController;

    @Test
    public void testHello() throws Exception {
        when(boardController.hello("둘리")).thenReturn("Hello : 둘리");
        mockMvc.perform(get("/hello").param("name", "둘리"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello : 둘리"))
                .andDo(print());
    }
}
