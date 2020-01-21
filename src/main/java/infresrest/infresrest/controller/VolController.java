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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(path = "/vol")
public class VolController {

    @GetMapping
    public ResponseEntity getAllVol() {
        List<Vol> vols = this.getRandoms() ;
        return  new ResponseEntity(vols, HttpStatus.OK);
    }


    private List<Vol> getRandoms(){
        ArrayList<Vol> vols = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<random.nextInt(5)+1; i++){
            vols.add(this.getRandom());
        }
        return vols;
    }

    private Vol getRandom(){
        Random random = new Random();
        Vol vol = new Vol();
        int place = random.nextInt((200) + 1);
        int id = random.nextInt((200) + 1);
        LocalDateTime dateVol = LocalDateTime.now();
        dateVol = dateVol.minus(random.nextInt((10)+1), ChronoUnit.DAYS);
        vol.setCompany(Company.randomEnum());
        vol.setDate(dateVol);
        vol.setPlace(place);
        vol.setId(id);
        return vol;
    }
}
