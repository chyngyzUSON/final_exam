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
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "citizen_region",
            joinColumns = @JoinColumn(name = "citizen_id"),
            inverseJoinColumns = @JoinColumn(name = "region_id"))
    private List<Region> regions;
}
