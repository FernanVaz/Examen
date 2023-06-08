package Softtek.Controler;


import Softtek.Modelo.autobuses;
import Softtek.Service.AutobusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
@RestController
@RequestMapping("/autobuses")
public class AutobusControler {
    @Autowired
    AutobusesService autobusesService;
    @GetMapping("/bus")
    ResponseEntity<List<autobuses>> getAll(){
        return ResponseEntity.ok(autobusesService.getAll());
    }

    @GetMapping("/{matricula}")
    ResponseEntity<autobuses> getAutobusByMatricula(@PathVariable("matricula") String matricula){
        return ResponseEntity.ok(autobusesService.getById(matricula));
    }
}
