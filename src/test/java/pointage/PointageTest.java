package pointage;

import com.sanda.pointage.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.*;
import java.util.List;

public class PointageTest {
    @Test
    void test(){
        var gardienType = new Categorie(
            CategoryType.Gardien,
            56,
            BigDecimal.valueOf(110_000),
            0,
            DayOfWeek.MONDAY,
            DayOfWeek.SUNDAY
        );

        var rakoto = new Employee(
            "rakoto",
            "prenoms",
            "cin",
            LocalDate.now() /*dateNaissance*/,
            LocalDate.now() /*dateEmbauche*/,
            LocalDate.now() /*finContrat*/,
            gardienType
        );

        var rabe = new Employee(
            "rabe",
            "prenoms",
            "cin",
            LocalDate.now() /*dateNaissance*/,
            LocalDate.now() /*dateEmbauche*/,
            LocalDate.now() /*finContrat*/,
            gardienType
        );

        var calendrier = new Calendar(Month.JUNE, List.of(
            17,
            25,
            26
        ));

        var pointages = List.of(
            new Pointage(rakoto, LocalTime.of(8, 0), LocalTime.of(17,8))
        );


    }
}
