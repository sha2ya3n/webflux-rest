package sha2ya3n.the2gen4tel4man.webfluxrest.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
public class Category {

    @Id
    private String id;
    private String description;
}
