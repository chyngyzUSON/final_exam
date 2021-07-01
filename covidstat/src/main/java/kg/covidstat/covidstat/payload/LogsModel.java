package kg.covidstat.covidstat.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LogsModel {
    private Long citizenId;
    private boolean infected;
    private boolean vaccinated;
    private LocalDate recordingDate;
}
