package pointage;

import com.sanda.pointage.Calendar;
import com.sanda.pointage.Categorie;
import com.sanda.pointage.CategoryType;
import com.sanda.pointage.Employee;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.List;

public class PointageTest {
    @Test
    void test(){
        var gardien = new Categorie(CategoryType.Gardien, 10, BigDecimal.valueOf(100_000));
        var rakoto = new Employee(
            "rakoto",
            "rakoto",
            "rakoto",
            LocalDate.now(),
            LocalDate.now(),
            LocalDate.now(),
            gardien
        );
        var vingtSixMai = MonthDay.of(Month.MAY, 26);
        var sixJuillet = MonthDay.of(Month.JULY, 6);
        var calendrier = new Calendar(vingtSixMai, sixJuillet, List.of(
            MonthDay.of(Month.JUNE, 17),
            MonthDay.of(Month.JUNE, 25),
            MonthDay.of(Month.JUNE, 26)
        ));


    }
}
