package med.voll.api.domain.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table
@Entity
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Usuario {
    private Long id;
    private String login;
    private String senha;
}
