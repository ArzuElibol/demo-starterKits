package example.demo.business.abstracts;

import java.util.List;

import example.demo.business.requests.CreateDemoRequest;
import example.demo.business.responses.GetAllDemoResponse;

public interface DemoService {
    List<GetAllDemoResponse> getAll();
    void add(CreateDemoRequest createDemoRequest);
}
