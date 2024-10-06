package az.ingress.entity;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    String name;
}
