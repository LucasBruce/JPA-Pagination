public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

    Page<Product> findAll(Pageable pageable);
}