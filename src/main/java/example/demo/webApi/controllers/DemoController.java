package example.demo.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.demo.business.abstracts.DemoService;
import example.demo.business.requests.CreateDemoRequest;
import example.demo.business.responses.GetAllDemoResponse;



@RestController
@RequestMapping("/api/demos")
public class DemoController {
    private DemoService demoService;
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/getall")
    public List<GetAllDemoResponse> getAll() {
        return demoService.getAll();

    }

    @PostMapping("/add")
    public void add(@RequestBody()CreateDemoRequest createDemoRequest) {
       this.demoService.add(createDemoRequest);
    }



}
