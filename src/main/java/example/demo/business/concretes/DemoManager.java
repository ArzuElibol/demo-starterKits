package example.demo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import example.demo.business.abstracts.DemoService;
import example.demo.business.requests.CreateDemoRequest;
import example.demo.business.responses.GetAllDemoResponse;
import example.demo.dataAccess.abstracts.DemoRepository;
import example.demo.entities.concretes.Demo;

@Service
public class DemoManager implements DemoService {

    private DemoRepository demoRepository;
    

    public DemoManager(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    public List<GetAllDemoResponse> getAll() {
        List<Demo> demos=demoRepository.findAll();
        List<GetAllDemoResponse> demoResponses=new ArrayList<GetAllDemoResponse>();

     for (Demo demo : demos) {
         GetAllDemoResponse responseItem=new GetAllDemoResponse();
         responseItem.setId(demo.getId());
         responseItem.setName(demo.getName());
         demoResponses.add(responseItem);

     }
     return demoResponses;
 
    }

    @Override
    public void add(CreateDemoRequest createDemoRequest) {
       Demo demo= new Demo();
       demo.setName(createDemoRequest.getName() );
      this.demoRepository.save(demo);
        
    }


}
