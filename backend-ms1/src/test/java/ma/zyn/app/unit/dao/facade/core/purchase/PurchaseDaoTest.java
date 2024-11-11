package ma.zyn.app.unit.dao.facade.core.purchase;

import ma.zyn.app.bean.core.purchase.Purchase;
import ma.zyn.app.dao.facade.core.purchase.PurchaseDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.time.LocalDateTime;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class PurchaseDaoTest {

@Autowired
    private PurchaseDao underTest;

    @BeforeEach
    void setUp() {
        underTest.deleteAll();
    }


    @Test
    void shouldFindById(){
        Long id = 1L;
        Purchase entity = new Purchase();
        entity.setId(id);
        underTest.save(entity);
        Purchase loaded = underTest.findById(id).orElse(null);
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        Purchase entity = new Purchase();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        Purchase loaded = underTest.findById(id).orElse(null);
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<Purchase> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<Purchase> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }

    @Test
    void shouldSave(){
        Purchase given = constructSample(1);
        Purchase saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private Purchase constructSample(int i) {
		Purchase given = new Purchase();
        given.setPurchaseDate(LocalDateTime.now());
        return given;
    }

}
