package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "suppliers", path = "suppliers")
public interface SupplierRepository
    extends PagingAndSortingRepository<Supplier, String> {}
