package misrraimsp.fourthrest.controller;

import lombok.RequiredArgsConstructor;
import misrraimsp.fourthrest.model.dto.TransferDTO;
import misrraimsp.fourthrest.service.PersonServer;
import misrraimsp.fourthrest.model.dto.PersonDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonServer personServer;

    @GetMapping("/people")
    public List<PersonDTO> allPeople() {
        return personServer.findAll();
    }

    @PostMapping("/people")
    public PersonDTO newPerson(@RequestBody PersonDTO dto) {
        return personServer.persist(dto);
    }

    @GetMapping("/transfers")
    public List<TransferDTO> allTransfers() {
        return personServer.getTransfers();
    }
}
