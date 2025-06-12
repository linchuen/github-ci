package cooba.com;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String rawHtml() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Plain HTML</title>
            </head>
            <body>
                <h1>Hello from raw HTML!</h1>
                <p>This is a plain HTML string returned from a Spring Boot API.</p>
            </body>
            </html>
        """;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}