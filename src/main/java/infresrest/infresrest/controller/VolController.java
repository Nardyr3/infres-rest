package infresrest.infresrest.controller;

import infresrest.infresrest.model.Company;
import infresrest.infresrest.model.Vol;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(path = "/vol")
public class VolController {

    @GetMapping
    public ResponseEntity<List<Vol>> getAllVol() {
        Vol vol = this.getRandom() ;
        return new ResponseEntity(vol, HttpStatus.OK);
    }




    private Vol getRandom(){
        Random random = new Random();
        Vol vol = new Vol();
        int place = random.nextInt((200 - 0) + 1);
        int id = random.nextInt((200 - 0) + 1);
        LocalDateTime dateVol = LocalDateTime.now();
        dateVol = dateVol.minus(random.nextInt((10-0)+1), ChronoUnit.DAYS);
        vol.setCompany(Company.randomEnum());
        vol.setDate(dateVol);
        vol.setPlace(place);
        vol.setId(id);
        return vol;
    }
}
