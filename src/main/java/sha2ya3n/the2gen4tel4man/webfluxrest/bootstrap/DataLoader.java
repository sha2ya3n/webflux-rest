package sha2ya3n.the2gen4tel4man.webfluxrest.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sha2ya3n.the2gen4tel4man.webfluxrest.domain.Category;
import sha2ya3n.the2gen4tel4man.webfluxrest.domain.Vendor;
import sha2ya3n.the2gen4tel4man.webfluxrest.repository.CategoryRepository;
import sha2ya3n.the2gen4tel4man.webfluxrest.repository.VendorRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;

    public DataLoader(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCategory();
        loadVendor();



//        if(categoryRepository.count().block() == null){
//            System.out.println( categoryRepository.count() + "Data loaded from DataLoader class");
//
//            categoryRepository.save(Category.builder().description("Fruits").build()).block();
//            categoryRepository.save(Category.builder().description("Fresh").build()).block();
//            categoryRepository.save(Category.builder().description("Bread").build()).block();
//            categoryRepository.save(Category.builder().description("Meats").build()).block();
//            categoryRepository.save(Category.builder().description("Eggs").build()).block();
//        }
//
//        if(vendorRepository.count().block() == null){
//            vendorRepository.save(Vendor.builder().firstname("Shayan").lastname("Khademian").build()).block();
//            vendorRepository.save(Vendor.builder().firstname("Shina").lastname("Khademian").build()).block();
//            vendorRepository.save(Vendor.builder().firstname("Ali").lastname("Asqari").build()).block();
//        }
    }

    private void loadCategory(){
        Category category1 = new Category();
        category1.setDescription("Description for cate 1");
        category1.setId("1");

        Category category2 = new Category();
        category2.setDescription("Description for category number two");
        category2.setId("2");

        Category category3 = new Category();
        category3.setDescription("Description for category number three");
        category3.setId("3");

        categoryRepository.save(category1).block();
        categoryRepository.save(category2).block();
        categoryRepository.save(category3).block();
    }

    private void loadVendor(){
        Vendor vendor1 = new Vendor();
        vendor1.setFirstname("Shayan");
        vendor1.setLastname("Khademian");
        vendor1.setId("1");

        Vendor vendor2 = new Vendor();
        vendor2.setFirstname("Shina");
        vendor2.setLastname("Khademian");
        vendor2.setId("2");

        Vendor vendor3 = new Vendor();
        vendor3.setFirstname("Ali");
        vendor3.setLastname("Khademian");
        vendor3.setId("3");

        vendorRepository.save(vendor1).block();
        vendorRepository.save(vendor2).block();
        vendorRepository.save(vendor3).block();
    }
}
