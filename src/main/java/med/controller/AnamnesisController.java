package med.controller;


import med.service.AnamnesisService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("anamnesis")
public class AnamnesisController {

    private AnamnesisService anamnesisService;

    public AnamnesisController(AnamnesisService anamnesisService){
        this.anamnesisService = anamnesisService;
    }

    @PostMapping
    public Long save(@RequestParam("csv")  MultipartFile file){
        anamnesisService.save(file);
        return 1L;
    }
}
