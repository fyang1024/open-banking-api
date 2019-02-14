package io.swagger.api;

import io.swagger.model.ResponseCommonCustomer;
import io.swagger.model.ResponseCommonCustomerDetailed;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonApiControllerIntegrationTest {

    @Autowired
    private CommonApi api;

    @Test
    public void getCustomerTest() throws Exception {
        ResponseEntity<ResponseCommonCustomer> responseEntity = api.getCustomer();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCustomerDetailTest() throws Exception {
        ResponseEntity<ResponseCommonCustomerDetailed> responseEntity = api.getCustomerDetail();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
