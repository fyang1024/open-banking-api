package io.swagger.api;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
    info = @Info(
        title = "Swagger Server", 
        version = "1-oas3", 
        description = "API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right",
        termsOfService = "",
        contact = @Contact(email = ""),
        license = @License(
            name = "MIT Licence",
            url = "https://opensource.org/licenses/MIT"
        )
    )
)
public class Bootstrap {
}
