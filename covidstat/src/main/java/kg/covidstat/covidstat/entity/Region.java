package kg.covidstat.covidstat.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long population;

    @ManyToMany
    @JoinTable(
            name = "citizen_region",
            joinColumns = @JoinColumn(name = "region_id"),
            inverseJoinColumns = @JoinColumn(name = "citizen_id")
    )
    List<Citizen> citizens;
}
