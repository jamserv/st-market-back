package com.st.market.stmarket;

import com.google.gson.Gson;
import com.st.market.stmarket.product.model.Product;
import com.st.market.stmarket.product.repository.ProductRepository;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 * @author janez
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application.integration.properties")
public class ProductTest {

    @Autowired
    MockMvc mockMvc;
    
    @Autowired
    ProductRepository repository;
    /*
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "available")
    private Long available;
    @Column(name = "description")
    private String description;
     */

    @Test
    public void proceed() throws Exception {
        for (int index = 1; index < 10; index++) {
            Product model = new Product();
            model.setTitle("title product " + index);
            model.setName("product _ " + index);
            model.setImage("assets/img/product/c-product-" + index + ".jpg");
            model.setOldPrice(new BigDecimal(index * 2));
            model.setNewPrice(new BigDecimal(index));
            model.setDiscount(30);
            model.setAvailable(index + 0L);
            model.setDescription("vida sempiterna; Dios es, según el pensamiento de la época, fuente originaria y sempiterna de justicia");

            Gson gson = new Gson();
            String o = gson.toJson(model);

            mockMvc.perform(post(o))
                    .andExpect(status().isOk());
        }

//        for (int index = 0; index < 100; index++) {
//            mockMvc.perform(all())
//                    .andExpect(status().isOk());                                    
//        }
//        
//        repository.deleteAll();

    }

    private RequestBuilder post(String o) {
        return MockMvcRequestBuilders
                .post("/api/v1/product/add", o)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(o);
    }

    private RequestBuilder all() {
        return MockMvcRequestBuilders
                .get("/api/v1/product/all")
                .contentType(MediaType.APPLICATION_JSON_UTF8);
    }

    private RequestBuilder put(String o) {
        return MockMvcRequestBuilders
                .post("/api/v1/product/update", o)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(o);
    }

}