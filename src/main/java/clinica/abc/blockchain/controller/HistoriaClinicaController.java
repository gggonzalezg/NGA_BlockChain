package clinica.abc.blockchain.controller;

import clinica.abc.blockchain.model.Health;
import clinica.abc.blockchain.model.HistoriaClinica;
import clinica.abc.blockchain.service.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;

import java.math.BigInteger;

@RestController
public class HistoriaClinicaController {

    @Autowired
    HistoriaClinicaService historiaClinicaService;

    @GetMapping("/health")
    public Health health(){
        return historiaClinicaService.health();
    }

    @PostMapping(path="/add", consumes = "application/json", produces = "application/json")
    public TransactionReceipt add(@RequestBody HistoriaClinica hc){
        return historiaClinicaService.addDocument(
                new HistoriaClinica(hc.getHash(),hc.getId(), hc.getTimestamp()));
    }

    @GetMapping("/get/{id}")
    public Tuple2<String, BigInteger> get(@PathVariable("id") int id){
        return historiaClinicaService.getDocument(BigInteger.valueOf(id));
    }
}
