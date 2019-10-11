package sha2ya3n.the2gen4tel4man.webfluxrest.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class Vendor {

    @Id
    private String id;
    private String firstname;
    private String lastname;
}
