package sha2ya3n.the2gen4tel4man.webfluxrest.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import sha2ya3n.the2gen4tel4man.webfluxrest.domain.Vendor;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
