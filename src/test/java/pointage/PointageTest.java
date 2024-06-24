package pointage;

import com.sanda.pointage.Calendar;
import com.sanda.pointage.Categorie;
import com.sanda.pointage.CategoryType;
import com.sanda.pointage.Employee;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class PointageTest {
    @Test
    void test(){
        var gardienType = new Categorie(
            CategoryType.Gardien,
            56,
            BigDecimal.valueOf(110_000),
            0
        );
        var rakoto = new Employee(
            "rakoto",
            "prenoms",
            "cin",
            LocalDate.now() /*dateNaissance*/,
            LocalDate.now() /*dateEmbauche*/,
            LocalDate.now() /*finContrat*/,
            BigDecimal.valueOf(110_000),
            gardienType
        );

        var calendrier = new Calendar(Month.JUNE, List.of(
            17,
            25,
            26
        ));


    }
}
