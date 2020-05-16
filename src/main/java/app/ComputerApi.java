package app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerApi {

    public ComputerApi() {
    }

    @PostMapping("/api/computer/add")
    public void addComputer(@RequestBody Computer computer) {

    }
}
